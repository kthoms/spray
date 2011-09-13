package org.eclipse.xtext.example.fowlerdsl.diagram.providers;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;

public class FowlerDslDiagramTypeProvider extends AbstractDiagramTypeProvider {

	public FowlerDslDiagramTypeProvider() {
		setFeatureProvider(new FowlerDslFeatureProvider(this));
	}
}
