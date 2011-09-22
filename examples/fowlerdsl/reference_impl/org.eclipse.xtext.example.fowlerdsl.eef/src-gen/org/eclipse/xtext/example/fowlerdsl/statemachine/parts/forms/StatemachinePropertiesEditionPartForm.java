/**
 * Generated with Acceleo
 */
package org.eclipse.xtext.example.fowlerdsl.statemachine.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.xtext.example.fowlerdsl.statemachine.parts.StatemachinePropertiesEditionPart;
import org.eclipse.xtext.example.fowlerdsl.statemachine.parts.StatemachineViewsRepository;
import org.eclipse.xtext.example.fowlerdsl.statemachine.providers.StatemachineMessages;


// End of user code

/**
 * 
 * 
 */
public class StatemachinePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, StatemachinePropertiesEditionPart {

	protected ReferencesTable events;
	protected List<ViewerFilter> eventsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> eventsFilters = new ArrayList<ViewerFilter>();
		protected ReferencesTable resetEvents;
		protected List<ViewerFilter> resetEventsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> resetEventsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable commands;
	protected List<ViewerFilter> commandsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> commandsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable states;
	protected List<ViewerFilter> statesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> statesFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public StatemachinePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence statemachine_Step = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = statemachine_Step.addStep(StatemachineViewsRepository.Statemachine_.Properties.class);
		propertiesStep.addStep(StatemachineViewsRepository.Statemachine_.Properties.events);
		propertiesStep.addStep(StatemachineViewsRepository.Statemachine_.Properties.resetEvents);
		propertiesStep.addStep(StatemachineViewsRepository.Statemachine_.Properties.commands);
		propertiesStep.addStep(StatemachineViewsRepository.Statemachine_.Properties.states);
		
		
		composer = new PartComposer(statemachine_Step) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == StatemachineViewsRepository.Statemachine_.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == StatemachineViewsRepository.Statemachine_.Properties.events) {
					return createEventsTableComposition(widgetFactory, parent);
				}
				if (key == StatemachineViewsRepository.Statemachine_.Properties.resetEvents) {
					return createResetEventsReferencesTable(widgetFactory, parent);
				}
				if (key == StatemachineViewsRepository.Statemachine_.Properties.commands) {
					return createCommandsTableComposition(widgetFactory, parent);
				}
				if (key == StatemachineViewsRepository.Statemachine_.Properties.states) {
					return createStatesTableComposition(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(StatemachineMessages.StatemachinePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createEventsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.events = new ReferencesTable(StatemachineMessages.StatemachinePropertiesEditionPart_EventsLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatemachinePropertiesEditionPartForm.this, StatemachineViewsRepository.Statemachine_.Properties.events, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				events.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatemachinePropertiesEditionPartForm.this, StatemachineViewsRepository.Statemachine_.Properties.events, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				events.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatemachinePropertiesEditionPartForm.this, StatemachineViewsRepository.Statemachine_.Properties.events, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				events.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatemachinePropertiesEditionPartForm.this, StatemachineViewsRepository.Statemachine_.Properties.events, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				events.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.eventsFilters) {
			this.events.addFilter(filter);
		}
		this.events.setHelpText(propertiesEditionComponent.getHelpContent(StatemachineViewsRepository.Statemachine_.Properties.events, StatemachineViewsRepository.FORM_KIND));
		this.events.createControls(parent, widgetFactory);
		this.events.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatemachinePropertiesEditionPartForm.this, StatemachineViewsRepository.Statemachine_.Properties.events, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData eventsData = new GridData(GridData.FILL_HORIZONTAL);
		eventsData.horizontalSpan = 3;
		this.events.setLayoutData(eventsData);
		this.events.setLowerBound(0);
		this.events.setUpperBound(-1);
		events.setID(StatemachineViewsRepository.Statemachine_.Properties.events);
		events.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createResetEventsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.resetEvents = new ReferencesTable(StatemachineMessages.StatemachinePropertiesEditionPart_ResetEventsLabel, new ReferencesTableListener	() {
			public void handleAdd() { addResetEvents(); }
			public void handleEdit(EObject element) { editResetEvents(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveResetEvents(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromResetEvents(element); }
			public void navigateTo(EObject element) { }
		});
		this.resetEvents.setHelpText(propertiesEditionComponent.getHelpContent(StatemachineViewsRepository.Statemachine_.Properties.resetEvents, StatemachineViewsRepository.FORM_KIND));
		this.resetEvents.createControls(parent, widgetFactory);
		this.resetEvents.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatemachinePropertiesEditionPartForm.this, StatemachineViewsRepository.Statemachine_.Properties.resetEvents, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData resetEventsData = new GridData(GridData.FILL_HORIZONTAL);
		resetEventsData.horizontalSpan = 3;
		this.resetEvents.setLayoutData(resetEventsData);
		this.resetEvents.disableMove();
		resetEvents.setID(StatemachineViewsRepository.Statemachine_.Properties.resetEvents);
		resetEvents.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addResetEvents() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(resetEvents.getInput(), resetEventsFilters, resetEventsBusinessFilters,
		"resetEvents", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatemachinePropertiesEditionPartForm.this, StatemachineViewsRepository.Statemachine_.Properties.resetEvents,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				resetEvents.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveResetEvents(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatemachinePropertiesEditionPartForm.this, StatemachineViewsRepository.Statemachine_.Properties.resetEvents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		resetEvents.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromResetEvents(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatemachinePropertiesEditionPartForm.this, StatemachineViewsRepository.Statemachine_.Properties.resetEvents, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		resetEvents.refresh();
	}

	/**
	 * 
	 */
	protected void editResetEvents(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				resetEvents.refresh();
			}
		}
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createCommandsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.commands = new ReferencesTable(StatemachineMessages.StatemachinePropertiesEditionPart_CommandsLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatemachinePropertiesEditionPartForm.this, StatemachineViewsRepository.Statemachine_.Properties.commands, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				commands.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatemachinePropertiesEditionPartForm.this, StatemachineViewsRepository.Statemachine_.Properties.commands, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				commands.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatemachinePropertiesEditionPartForm.this, StatemachineViewsRepository.Statemachine_.Properties.commands, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				commands.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatemachinePropertiesEditionPartForm.this, StatemachineViewsRepository.Statemachine_.Properties.commands, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				commands.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.commandsFilters) {
			this.commands.addFilter(filter);
		}
		this.commands.setHelpText(propertiesEditionComponent.getHelpContent(StatemachineViewsRepository.Statemachine_.Properties.commands, StatemachineViewsRepository.FORM_KIND));
		this.commands.createControls(parent, widgetFactory);
		this.commands.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatemachinePropertiesEditionPartForm.this, StatemachineViewsRepository.Statemachine_.Properties.commands, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData commandsData = new GridData(GridData.FILL_HORIZONTAL);
		commandsData.horizontalSpan = 3;
		this.commands.setLayoutData(commandsData);
		this.commands.setLowerBound(0);
		this.commands.setUpperBound(-1);
		commands.setID(StatemachineViewsRepository.Statemachine_.Properties.commands);
		commands.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createStatesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.states = new ReferencesTable(StatemachineMessages.StatemachinePropertiesEditionPart_StatesLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatemachinePropertiesEditionPartForm.this, StatemachineViewsRepository.Statemachine_.Properties.states, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				states.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatemachinePropertiesEditionPartForm.this, StatemachineViewsRepository.Statemachine_.Properties.states, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				states.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatemachinePropertiesEditionPartForm.this, StatemachineViewsRepository.Statemachine_.Properties.states, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				states.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatemachinePropertiesEditionPartForm.this, StatemachineViewsRepository.Statemachine_.Properties.states, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				states.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.statesFilters) {
			this.states.addFilter(filter);
		}
		this.states.setHelpText(propertiesEditionComponent.getHelpContent(StatemachineViewsRepository.Statemachine_.Properties.states, StatemachineViewsRepository.FORM_KIND));
		this.states.createControls(parent, widgetFactory);
		this.states.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StatemachinePropertiesEditionPartForm.this, StatemachineViewsRepository.Statemachine_.Properties.states, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData statesData = new GridData(GridData.FILL_HORIZONTAL);
		statesData.horizontalSpan = 3;
		this.states.setLayoutData(statesData);
		this.states.setLowerBound(0);
		this.states.setUpperBound(-1);
		states.setID(StatemachineViewsRepository.Statemachine_.Properties.states);
		states.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.parts.StatemachinePropertiesEditionPart#initEvents(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initEvents(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		events.setContentProvider(contentProvider);
		events.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.parts.StatemachinePropertiesEditionPart#updateEvents()
	 * 
	 */
	public void updateEvents() {
	events.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.parts.StatemachinePropertiesEditionPart#addFilterEvents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEvents(ViewerFilter filter) {
		eventsFilters.add(filter);
		if (this.events != null) {
			this.events.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.parts.StatemachinePropertiesEditionPart#addBusinessFilterEvents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEvents(ViewerFilter filter) {
		eventsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.parts.StatemachinePropertiesEditionPart#isContainedInEventsTable(EObject element)
	 * 
	 */
	public boolean isContainedInEventsTable(EObject element) {
		return ((ReferencesTableSettings)events.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.parts.StatemachinePropertiesEditionPart#initResetEvents(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initResetEvents(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		resetEvents.setContentProvider(contentProvider);
		resetEvents.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.parts.StatemachinePropertiesEditionPart#updateResetEvents()
	 * 
	 */
	public void updateResetEvents() {
	resetEvents.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.parts.StatemachinePropertiesEditionPart#addFilterResetEvents(ViewerFilter filter)
	 * 
	 */
	public void addFilterToResetEvents(ViewerFilter filter) {
		resetEventsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.parts.StatemachinePropertiesEditionPart#addBusinessFilterResetEvents(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToResetEvents(ViewerFilter filter) {
		resetEventsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.parts.StatemachinePropertiesEditionPart#isContainedInResetEventsTable(EObject element)
	 * 
	 */
	public boolean isContainedInResetEventsTable(EObject element) {
		return ((ReferencesTableSettings)resetEvents.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.parts.StatemachinePropertiesEditionPart#initCommands(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initCommands(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		commands.setContentProvider(contentProvider);
		commands.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.parts.StatemachinePropertiesEditionPart#updateCommands()
	 * 
	 */
	public void updateCommands() {
	commands.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.parts.StatemachinePropertiesEditionPart#addFilterCommands(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCommands(ViewerFilter filter) {
		commandsFilters.add(filter);
		if (this.commands != null) {
			this.commands.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.parts.StatemachinePropertiesEditionPart#addBusinessFilterCommands(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCommands(ViewerFilter filter) {
		commandsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.parts.StatemachinePropertiesEditionPart#isContainedInCommandsTable(EObject element)
	 * 
	 */
	public boolean isContainedInCommandsTable(EObject element) {
		return ((ReferencesTableSettings)commands.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.parts.StatemachinePropertiesEditionPart#initStates(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initStates(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		states.setContentProvider(contentProvider);
		states.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.parts.StatemachinePropertiesEditionPart#updateStates()
	 * 
	 */
	public void updateStates() {
	states.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.parts.StatemachinePropertiesEditionPart#addFilterStates(ViewerFilter filter)
	 * 
	 */
	public void addFilterToStates(ViewerFilter filter) {
		statesFilters.add(filter);
		if (this.states != null) {
			this.states.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.parts.StatemachinePropertiesEditionPart#addBusinessFilterStates(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToStates(ViewerFilter filter) {
		statesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.xtext.example.fowlerdsl.statemachine.parts.StatemachinePropertiesEditionPart#isContainedInStatesTable(EObject element)
	 * 
	 */
	public boolean isContainedInStatesTable(EObject element) {
		return ((ReferencesTableSettings)states.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return StatemachineMessages.Statemachine_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
