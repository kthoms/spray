/**
 * Generated with Acceleo
 */
package org.eclipse.xtext.example.fowlerdsl.statemachine.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface StatemachinePropertiesEditionPart {



	/**
	 * Init the events
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initEvents(ReferencesTableSettings settings);

	/**
	 * Update the events
	 * @param newValue the events to update
	 * 
	 */
	public void updateEvents();

	/**
	 * Adds the given filter to the events edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEvents(ViewerFilter filter);

	/**
	 * Adds the given filter to the events edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEvents(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the events table
	 * 
	 */
	public boolean isContainedInEventsTable(EObject element);




	/**
	 * Init the resetEvents
	 * @param settings settings for the resetEvents ReferencesTable 
	 */
	public void initResetEvents(ReferencesTableSettings settings);

	/**
	 * Update the resetEvents
	 * @param newValue the resetEvents to update
	 * 
	 */
	public void updateResetEvents();

	/**
	 * Adds the given filter to the resetEvents edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToResetEvents(ViewerFilter filter);

	/**
	 * Adds the given filter to the resetEvents edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToResetEvents(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the resetEvents table
	 * 
	 */
	public boolean isContainedInResetEventsTable(EObject element);




	/**
	 * Init the commands
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initCommands(ReferencesTableSettings settings);

	/**
	 * Update the commands
	 * @param newValue the commands to update
	 * 
	 */
	public void updateCommands();

	/**
	 * Adds the given filter to the commands edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCommands(ViewerFilter filter);

	/**
	 * Adds the given filter to the commands edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCommands(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the commands table
	 * 
	 */
	public boolean isContainedInCommandsTable(EObject element);




	/**
	 * Init the states
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initStates(ReferencesTableSettings settings);

	/**
	 * Update the states
	 * @param newValue the states to update
	 * 
	 */
	public void updateStates();

	/**
	 * Adds the given filter to the states edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToStates(ViewerFilter filter);

	/**
	 * Adds the given filter to the states edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToStates(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the states table
	 * 
	 */
	public boolean isContainedInStatesTable(EObject element);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
