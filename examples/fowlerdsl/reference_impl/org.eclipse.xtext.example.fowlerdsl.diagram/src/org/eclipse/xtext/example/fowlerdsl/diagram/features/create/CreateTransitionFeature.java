package org.eclipse.xtext.example.fowlerdsl.diagram.features.create;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.xtext.example.fowlerdsl.diagram.helper.DialogHelper;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Event;
import org.eclipse.xtext.example.fowlerdsl.statemachine.State;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachineFactory;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Transition;

public class CreateTransitionFeature extends AbstractCreateConnectionFeature {

	public CreateTransitionFeature(IFeatureProvider fp) {
		this(fp, "Transition", "A transition");
	}

	public CreateTransitionFeature(IFeatureProvider fp, String name,
			String description) {
		super(fp, name, description);
	}

	@Override
	public boolean canStartConnection(ICreateConnectionContext context) {
		boolean canStart = false;
		if (getState(context.getSourceAnchor()) != null) {
			canStart = true;
		}
		return canStart;
	}

	@Override
	public boolean canCreate(ICreateConnectionContext context) {
		State source = getState(context.getSourceAnchor());
		State target = getState(context.getTargetAnchor());
		if (source != null && target != null && source != target) {
			return true;
		}
		return false;
	}

	private State getState(Anchor anchor) {
		State state = null;
		if (anchor != null) {
			Object object = getBusinessObjectForPictogramElement(anchor
					.getParent());
			if (object instanceof State) {
				state = (State) object;
			}
		}
		return state;
	}

	@Override
	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;
		State source = getState(context.getSourceAnchor());
		State target = getState(context.getTargetAnchor());
		if (source != null && target != null) {
			Transition transition = createTransition(source, target);
			AddConnectionContext addContext = new AddConnectionContext(
					context.getSourceAnchor(), context.getTargetAnchor());
			addContext.setNewObject(transition);
			newConnection = (Connection) getFeatureProvider().addIfPossible(
					addContext);
		}
		return newConnection;
	}

	private Transition createTransition(State source, State target) {
		String eventName = DialogHelper.askString("Event", "Event name",
				source.getName() + "->" + target.getName());
		Event event = null;
		for (Event existingEvent : ((Statemachine) source.eContainer())
				.getEvents()) {
			if (existingEvent.getName().equals(eventName)) {
				event = existingEvent;
				break;
			}
		}
		Transition transition = null;
		if (event != null) {
			transition = foundExistingTransition(source, event);
		} else {
			event = StatemachineFactory.eINSTANCE.createEvent();
			event.setName(eventName);
			((Statemachine) source.eContainer()).getEvents().add(event);
		}
		if (transition == null) {
			transition = StatemachineFactory.eINSTANCE.createTransition();
			transition.setState(target);
			transition.setEvent(event);
			source.getTransitions().add(transition);
		}
		return transition;
	}

	private Transition foundExistingTransition(State source, Event event) {
		Transition transition = null;
		for (Transition existingTransition : source.getTransitions()) {
			if (existingTransition.getEvent().getName().equals(event.getName())
					&& existingTransition.getState().getName()
							.equals(source.getName())) {
				transition = existingTransition;
				break;
			}
		}
		return transition;
	}
}
