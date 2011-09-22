package org.eclipselabs.spray.xtext;

import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.eclipselabs.spray.xtext.customizing.SprayQualifiedNameProvider;
import org.eclipselabs.spray.xtext.customizing.SpraySimpleNameProvider;
import org.eclipselabs.spray.xtext.customizing.SprayTypeProvider;
import org.eclipselabs.spray.xtext.generator.CodeFormatterProvider;
import org.eclipselabs.spray.xtext.generator.IPostProcessor;
import org.eclipselabs.spray.xtext.generator.JavaIoFileSystemAccessExt;
import org.eclipselabs.spray.xtext.generator.JavaPostProcessor;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("restriction")
public class SprayRuntimeModule extends AbstractSprayRuntimeModule {
    @Override
    public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
        return SprayQualifiedNameProvider.class;
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
        binder.bind(String.class).annotatedWith(Names.named(CodeFormatterProvider.JDT_FORMATTER_CONFIG)).toInstance("org/eclipselabs/spray/xtext/generator/formatter.xml");
    }

    @Override
    public Class<? extends IdentifiableSimpleNameProvider> bindIdentifiableSimpleNameProvider() {
        return SpraySimpleNameProvider.class;
    }

    @Override
    public Class<? extends ITypeProvider> bindITypeProvider() {
        return SprayTypeProvider.class;
    }
}
