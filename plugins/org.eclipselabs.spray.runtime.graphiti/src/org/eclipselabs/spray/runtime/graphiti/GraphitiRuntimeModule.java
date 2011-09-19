package org.eclipselabs.spray.runtime.graphiti;

import org.eclipse.graphiti.util.IColorConstant;
import org.eclipse.xtext.service.AbstractGenericModule;

import com.google.inject.Binder;
import com.google.inject.name.Names;

public class GraphitiRuntimeModule extends AbstractGenericModule {
    @Override
    public void configure(Binder binder) {
        super.configure(binder);
    }
    
    protected void configureColorConstants (Binder binder) {
        binder.bind(IColorConstant.class).annotatedWith(Names.named("WHITE")).toInstance(IColorConstant.WHITE);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("LIGHT_LIGHT_GRAY")).toInstance(IColorConstant.LIGHT_LIGHT_GRAY);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("LIGHT_GRAY")).toInstance(IColorConstant.LIGHT_GRAY);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("GRAY")).toInstance(IColorConstant.GRAY);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("DARK_GRAY")).toInstance(IColorConstant.DARK_GRAY);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("BLACK")).toInstance(IColorConstant.BLACK);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("RED")).toInstance(IColorConstant.RED);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("BLACK")).toInstance(IColorConstant.BLACK);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("LIGHT_ORANGE")).toInstance(IColorConstant.LIGHT_ORANGE);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("ORANGE")).toInstance(IColorConstant.ORANGE);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("DARK_ORANGE")).toInstance(IColorConstant.DARK_ORANGE);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("YELLOW")).toInstance(IColorConstant.YELLOW);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("GREEN")).toInstance(IColorConstant.GREEN);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("LIGHT_GREEN")).toInstance(IColorConstant.LIGHT_GREEN);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("DARK_GREEN")).toInstance(IColorConstant.DARK_GREEN);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("CYAN")).toInstance(IColorConstant.CYAN);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("LIGHT_BLUE")).toInstance(IColorConstant.LIGHT_BLUE);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("CYAN")).toInstance(IColorConstant.CYAN);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("BLUE")).toInstance(IColorConstant.BLUE);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("DARK_BLUE")).toInstance(IColorConstant.DARK_BLUE);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("HANDLE_FG")).toInstance(IColorConstant.HANDLE_FG);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("HANDLE_BG")).toInstance(IColorConstant.HANDLE_BG);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("SHAPE_SELECTION_FG")).toInstance(IColorConstant.SHAPE_SELECTION_FG);
        binder.bind(IColorConstant.class).annotatedWith(Names.named("CONNECTION_SELECTION_FG")).toInstance(IColorConstant.CONNECTION_SELECTION_FG);
    }
    
}
