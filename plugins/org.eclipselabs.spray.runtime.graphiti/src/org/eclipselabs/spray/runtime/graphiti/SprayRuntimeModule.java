package org.eclipselabs.spray.runtime.graphiti;

import org.eclipse.graphiti.util.IColorConstant;
import org.eclipselabs.spray.runtime.graphiti.containers.ISprayColorConstants;

import com.google.inject.Binder;
import com.google.inject.name.Names;


public class SprayRuntimeModule extends GraphitiRuntimeModule {
    @Override
    protected void configureColorConstants(Binder binder) {
        super.configureColorConstants(binder);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("CONCEPT")).toInstance(ISprayColorConstants.CONCEPT);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("PINK")).toInstance(ISprayColorConstants.PINK);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("CALCULATION")).toInstance(ISprayColorConstants.CALCULATION);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("RULE")).toInstance(ISprayColorConstants.RULE);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("REQUEST")).toInstance(ISprayColorConstants.REQUEST);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("ROLE")).toInstance(ISprayColorConstants.ROLE);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("TRANSPARENT")).toInstance(ISprayColorConstants.TRANSPARENT);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("PROPERTYSPEC")).toInstance(ISprayColorConstants.PROPERTYSPEC);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("ALLOWEDVALUE")).toInstance(ISprayColorConstants.ALLOWEDVALUE);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("USAGE_INCOMPLETE")).toInstance(ISprayColorConstants.USAGE_INCOMPLETE);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("CLASS_TEXT_FOREGROUND")).toInstance(ISprayColorConstants.CLASS_TEXT_FOREGROUND);
    }
}
