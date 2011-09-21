package org.eclipselabs.spray.xtext.api;

public interface IColorConstantTypeProvider {
    /**
     * Runtime specific type of color.
     * For example, for Graphiti this is org.eclipse.graphiti.util.IColorConstant.
     */
    Class<?> getColorType();

    /**
     * Provides the class names that contain fields for color constants.
     * For example, for Graphiti this is org.eclipse.graphiti.util.IColorConstant.
     * These fields will be available as implicit colors.
     * This indirection is used to keep the language independent from the runtime.
     */
    Class<?>[] getColorConstantTypes();
}
