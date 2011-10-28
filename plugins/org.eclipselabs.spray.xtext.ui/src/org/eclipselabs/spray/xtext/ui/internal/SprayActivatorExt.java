package org.eclipselabs.spray.xtext.ui.internal;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.xtext.util.Modules2;
import org.eclipselabs.spray.generator.graphiti.GraphitiGeneratorModule;
import org.eclipselabs.spray.runtime.graphiti.GraphitiRuntimeModule;
import org.eclipselabs.spray.xtext.SprayRuntimeModule;
import org.osgi.framework.BundleContext;

import com.google.inject.Inject;
import com.google.inject.Module;

public class SprayActivatorExt extends SprayActivator {
    public static final String               LANGUAGE_ID = "org.eclipselabs.spray.xtext.Spray";

    @Inject
    private RegisterPlatformGenmodelListener registerPlatformGenmodelListener;
    private SprayResourceChangeBuildInvoker  sprayResourceChangeBuildInvoker;

    @Override
    protected Module getRuntimeModule(String grammar) {
        // TODO: Get rid of direct dependencies to Graphiti, add Extension Point for additional modules
        return Modules2.mixin(super.getRuntimeModule(grammar), new SprayRuntimeModule(), new GraphitiRuntimeModule(), new GraphitiGeneratorModule());
    }

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        sprayResourceChangeBuildInvoker = new SprayResourceChangeBuildInvoker(this);
        ResourcesPlugin.getWorkspace().addResourceChangeListener(sprayResourceChangeBuildInvoker);
        ResourcesPlugin.getWorkspace().addResourceChangeListener(registerPlatformGenmodelListener);
        // register workspace genmodels
        registerPlatformGenmodelListener.initWorkspace();
        getInjector(LANGUAGE_ID).injectMembers(this);
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        ResourcesPlugin.getWorkspace().removeResourceChangeListener(sprayResourceChangeBuildInvoker);
        ResourcesPlugin.getWorkspace().removeResourceChangeListener(registerPlatformGenmodelListener);
        super.stop(context);
    }
}
