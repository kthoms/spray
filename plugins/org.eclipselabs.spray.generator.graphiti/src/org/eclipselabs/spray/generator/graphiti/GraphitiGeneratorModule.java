package org.eclipselabs.spray.generator.graphiti;

import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.service.AbstractGenericModule;
import org.eclipselabs.spray.generator.graphiti.formatting.CodeFormatterProvider;
import org.eclipselabs.spray.generator.graphiti.formatting.IPostProcessor;
import org.eclipselabs.spray.generator.graphiti.formatting.JavaIoFileSystemAccessExt;
import org.eclipselabs.spray.generator.graphiti.formatting.JavaPostProcessor;
import org.eclipselabs.spray.generator.graphiti.util.ImportUtil;

import com.google.inject.Binder;
import com.google.inject.Scopes;
import com.google.inject.name.Names;

public class GraphitiGeneratorModule extends AbstractGenericModule {
    @Override
    public void configure(Binder binder) {
        super.configure(binder);
        binder.bind(ImportUtil.class).in(Scopes.SINGLETON);
    }
    public Class<? extends org.eclipse.xtext.generator.IGenerator> bindIGenerator() {
        return SprayGenerator.class;
    }
    public Class<? extends JavaIoFileSystemAccess> bindJavaIoFileSystemAccess() {
        return JavaIoFileSystemAccessExt.class;
    }

    public void configureCodeFormatterProvider(Binder binder) {
        binder.bind(CodeFormatter.class).toProvider(CodeFormatterProvider.class);
    }

    public void configureJavaPostProcessor(Binder binder) {
        binder.bind(IPostProcessor.class).annotatedWith(Names.named("java")).to(JavaPostProcessor.class);
    }

    public void configureJavaFormatterConfig(Binder binder) {
        binder.bind(String.class).annotatedWith(Names.named(CodeFormatterProvider.JDT_FORMATTER_CONFIG)).toInstance("org/eclipselabs/spray/generator/graphiti/formatting/formatter.xml");
    }

}
