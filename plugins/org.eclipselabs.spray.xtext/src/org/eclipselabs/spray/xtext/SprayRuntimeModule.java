package org.eclipselabs.spray.xtext;

import java.util.Set;

import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.featurecalls.IdentifiableSimpleNameProvider;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.eclipselabs.spray.xtext.api.IConstants;
import org.eclipselabs.spray.xtext.customizing.SprayDocumentationProvider;
import org.eclipselabs.spray.xtext.customizing.SprayQualifiedNameProvider;
import org.eclipselabs.spray.xtext.customizing.SpraySimpleNameProvider;
import org.eclipselabs.spray.xtext.customizing.SprayTypeProvider;
import org.eclipselabs.spray.xtext.scoping.SprayScopeProvider;

import com.google.common.collect.Sets;
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

    @Override
    public Class<? extends IdentifiableSimpleNameProvider> bindIdentifiableSimpleNameProvider() {
        return SpraySimpleNameProvider.class;
    }

    @Override
    public Class<? extends ITypeProvider> bindITypeProvider() {
        return SprayTypeProvider.class;
    }

    public Class<? extends IEObjectDocumentationProvider> bindIEObjectDocumentationProvider() {
        return SprayDocumentationProvider.class;
    }

    public void configureValidIconFileExtensions(Binder binder) {
        binder.bind(Set.class).annotatedWith(Names.named(IConstants.NAME_VALID_ICON_FILE_EXTENSIONS)).toInstance(Sets.newHashSet("gif", "png", "bmp", "ico"));
    }

    public Class<? extends org.eclipse.xtext.scoping.IScopeProvider> bindIScopeProvider() {
        return SprayScopeProvider.class;
    }
}
