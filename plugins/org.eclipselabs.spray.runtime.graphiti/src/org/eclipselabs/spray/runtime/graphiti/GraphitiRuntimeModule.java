package org.eclipselabs.spray.runtime.graphiti;

import org.eclipse.graphiti.mm.pictograms.PictogramsFactory;
import org.eclipse.graphiti.mm.pictograms.PictogramsPackage;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.ICreateService;
import org.eclipse.graphiti.services.IGaCreateService;
import org.eclipse.graphiti.services.IGaLayoutService;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.ILayoutService;
import org.eclipse.graphiti.services.ILinkService;
import org.eclipse.graphiti.services.IMigrationService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.services.IPeLayoutService;
import org.eclipse.graphiti.services.IPeService;
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

        binder.bind(PictogramsPackage.class).toInstance(PictogramsPackage.eINSTANCE);
        binder.bind(PictogramsFactory.class).toInstance(PictogramsFactory.eINSTANCE);
    }

    //---------------------------------------------------------------------------------------------
    // Bind Graphiti default services
    //---------------------------------------------------------------------------------------------
    public void configureICreateService(Binder binder) {
        binder.bind(ICreateService.class).toInstance(Graphiti.getCreateService());
    }

    public void configureIGaCreateService(Binder binder) {
        binder.bind(IGaCreateService.class).toInstance(Graphiti.getGaCreateService());
    }

    public void configureIGaService(Binder binder) {
        binder.bind(IGaService.class).toInstance(Graphiti.getGaService());
    }

    public void configureIGaLayoutService(Binder binder) {
        binder.bind(IGaLayoutService.class).toInstance(Graphiti.getGaLayoutService());
    }

    public void configureILayoutService(Binder binder) {
        binder.bind(ILayoutService.class).toInstance(Graphiti.getLayoutService());
    }

    public void configureILinkService(Binder binder) {
        binder.bind(ILinkService.class).toInstance(Graphiti.getLinkService());
    }

    public void configureIMigrationService(Binder binder) {
        binder.bind(IMigrationService.class).toInstance(Graphiti.getMigrationService());
    }

    public void configureIPeCreateService(Binder binder) {
        binder.bind(IPeCreateService.class).toInstance(Graphiti.getPeCreateService());
    }

    public void configureIPeLayoutService(Binder binder) {
        binder.bind(IPeLayoutService.class).toInstance(Graphiti.getPeLayoutService());
    }

    public void configureIPeService(Binder binder) {
        binder.bind(IPeService.class).toInstance(Graphiti.getPeService());
    }

}
