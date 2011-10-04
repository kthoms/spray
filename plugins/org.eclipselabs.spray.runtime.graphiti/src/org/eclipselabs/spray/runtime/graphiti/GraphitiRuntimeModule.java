package org.eclipselabs.spray.runtime.graphiti;

import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;
import org.eclipse.xtext.service.AbstractGenericModule;
import org.eclipselabs.spray.xtext.api.IColorConstantTypeProvider;

import com.google.inject.Binder;

public class GraphitiRuntimeModule extends AbstractGenericModule {
    @Override
    public void configure(Binder binder) {
        super.configure(binder);
        binder.bind(IColorConstantTypeProvider.class).toInstance(new IColorConstantTypeProvider() {
            @Override
            public Class<?> getColorType() {
                return IColorConstant.class;
            }

            @Override
            public Class<?>[] getColorConstantTypes() {
                return new Class<?>[]{IColorConstant.class};
            }
        });
    }

    //---------------------------------------------------------------------------------------------
    // Bind Graphiti default services
    //---------------------------------------------------------------------------------------------
    public void configureIGaService(Binder binder) {
        binder.bind(IGaService.class).toInstance(Graphiti.getGaService());
    }

    public void configureIPeCreateService(Binder binder) {
        binder.bind(IPeCreateService.class).toInstance(Graphiti.getPeCreateService());
    }
}
