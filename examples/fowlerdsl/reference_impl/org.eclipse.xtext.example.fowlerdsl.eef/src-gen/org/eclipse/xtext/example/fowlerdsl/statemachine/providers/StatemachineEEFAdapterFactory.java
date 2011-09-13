/**
 * Generated with Acceleo
 */
package org.eclipse.xtext.example.fowlerdsl.statemachine.providers;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.xtext.example.fowlerdsl.statemachine.util.StatemachineAdapterFactory;


/**
 * 
 * 
 */
public class StatemachineEEFAdapterFactory extends StatemachineAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.util.StatemachineAdapterFactory#createStatemachineAdapter()
	 * 
	 */
	public Adapter createStatemachineAdapter() {
		return new StatemachinePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.util.StatemachineAdapterFactory#createEventAdapter()
	 * 
	 */
	public Adapter createEventAdapter() {
		return new EventPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.util.StatemachineAdapterFactory#createCommandAdapter()
	 * 
	 */
	public Adapter createCommandAdapter() {
		return new CommandPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.util.StatemachineAdapterFactory#createStateAdapter()
	 * 
	 */
	public Adapter createStateAdapter() {
		return new StatePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.util.StatemachineAdapterFactory#createTransitionAdapter()
	 * 
	 */
	public Adapter createTransitionAdapter() {
		return new TransitionPropertiesEditionProvider();
	}

}
