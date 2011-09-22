package org.eclipselabs.spray.generator.graphiti;

import org.eclipse.xtext.service.AbstractGenericModule;
import org.eclipselabs.spray.generator.graphiti.util.ImportUtil;

import com.google.inject.Binder;
import com.google.inject.Scopes;

public class GraphitiGeneratorModule extends AbstractGenericModule {
    @Override
    public void configure(Binder binder) {
        super.configure(binder);
        binder.bind(ImportUtil.class).in(Scopes.SINGLETON);
    }
}
