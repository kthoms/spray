package org.eclipse.xtext.example.fowlerdsl.diagram.features.create;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.xtext.example.fowlerdsl.diagram.helper.DialogHelper;
import org.eclipse.xtext.example.fowlerdsl.statemachine.State;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachineFactory;

public class CreateStateFeature extends AbstractCreateFeature {

	public CreateStateFeature(IFeatureProvider fp) {
		this(fp, "State", "A state");
	}

	public CreateStateFeature(IFeatureProvider fp, String name,
			String description) {
		super(fp, name, description);
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		String stateName = DialogHelper.askString("State",
				"state name", "");
		if (stateName == null || stateName.trim().length() == 0) {
			return EMPTY;
		}
		Resource diagramRes = getDiagram().eResource();
		String diagUriStr = diagramRes.getURI().toPlatformString(true);
		String modelUriStr = diagUriStr.replace(".diagram", ".statemachine");
		URI modelURI = URI.createPlatformResourceURI(modelUriStr, true);
		Resource modelResource = null;
		modelResource = diagramRes.getResourceSet().getResource(modelURI, true);
		if(modelResource == null) {
			modelResource = diagramRes.getResourceSet().createResource(modelURI);
		}
		Statemachine stm = null;
		for(EObject root : modelResource.getContents()) {
			if(root instanceof Statemachine) {
				stm = (Statemachine) root;
				break;
			}
		}
		if(stm == null) {
			stm = StatemachineFactory.eINSTANCE.createStatemachine();
			modelResource.getContents().add(stm);
		}
		State state = null;
		for(State existingState : stm.getStates()) {
			if(existingState.getName().equals(stateName)) {
				state = existingState;
				break;
			}
		}
		if(state == null) {
			state = StatemachineFactory.eINSTANCE.createState();
			state.setName(stateName);
			stm.getStates().add(state);
		}
		addGraphicalRepresentation(context, state);
		return new Object[] { state };
	}
}
