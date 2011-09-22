/**
 * Generated with Acceleo
 */
package org.eclipse.xtext.example.fowlerdsl.statemachine.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;
import org.eclipse.xtext.example.fowlerdsl.statemachine.parts.StatemachineViewsRepository;
import org.eclipse.xtext.example.fowlerdsl.statemachine.parts.forms.CommandPropertiesEditionPartForm;
import org.eclipse.xtext.example.fowlerdsl.statemachine.parts.forms.EventPropertiesEditionPartForm;
import org.eclipse.xtext.example.fowlerdsl.statemachine.parts.forms.StatePropertiesEditionPartForm;
import org.eclipse.xtext.example.fowlerdsl.statemachine.parts.forms.StatemachinePropertiesEditionPartForm;
import org.eclipse.xtext.example.fowlerdsl.statemachine.parts.forms.TransitionPropertiesEditionPartForm;
import org.eclipse.xtext.example.fowlerdsl.statemachine.parts.impl.CommandPropertiesEditionPartImpl;
import org.eclipse.xtext.example.fowlerdsl.statemachine.parts.impl.EventPropertiesEditionPartImpl;
import org.eclipse.xtext.example.fowlerdsl.statemachine.parts.impl.StatePropertiesEditionPartImpl;
import org.eclipse.xtext.example.fowlerdsl.statemachine.parts.impl.StatemachinePropertiesEditionPartImpl;
import org.eclipse.xtext.example.fowlerdsl.statemachine.parts.impl.TransitionPropertiesEditionPartImpl;




/**
 * 
 * 
 */
public class StatemachinePropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == StatemachineViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == StatemachineViewsRepository.Statemachine_.class) {
			if (kind == StatemachineViewsRepository.SWT_KIND)
				return new StatemachinePropertiesEditionPartImpl(component);
			if (kind == StatemachineViewsRepository.FORM_KIND)
				return new StatemachinePropertiesEditionPartForm(component);
		}
		if (key == StatemachineViewsRepository.Event.class) {
			if (kind == StatemachineViewsRepository.SWT_KIND)
				return new EventPropertiesEditionPartImpl(component);
			if (kind == StatemachineViewsRepository.FORM_KIND)
				return new EventPropertiesEditionPartForm(component);
		}
		if (key == StatemachineViewsRepository.Command.class) {
			if (kind == StatemachineViewsRepository.SWT_KIND)
				return new CommandPropertiesEditionPartImpl(component);
			if (kind == StatemachineViewsRepository.FORM_KIND)
				return new CommandPropertiesEditionPartForm(component);
		}
		if (key == StatemachineViewsRepository.State.class) {
			if (kind == StatemachineViewsRepository.SWT_KIND)
				return new StatePropertiesEditionPartImpl(component);
			if (kind == StatemachineViewsRepository.FORM_KIND)
				return new StatePropertiesEditionPartForm(component);
		}
		if (key == StatemachineViewsRepository.Transition.class) {
			if (kind == StatemachineViewsRepository.SWT_KIND)
				return new TransitionPropertiesEditionPartImpl(component);
			if (kind == StatemachineViewsRepository.FORM_KIND)
				return new TransitionPropertiesEditionPartForm(component);
		}
		return null;
	}

}
