package org.eclipse.xtext.example.fowlerdsl.diagram.properties;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.xtext.example.fowlerdsl.statemachine.parts.forms.StatePropertiesEditionPartForm;
import org.eclipse.xtext.example.fowlerdsl.statemachine.parts.forms.TransitionPropertiesEditionPartForm;
import org.eclipse.xtext.example.fowlerdsl.statemachine.providers.StatemachinePropertiesEditionPartProvider;

public class CustomStatemachinePropertiesEditionPartProvider extends
		StatemachinePropertiesEditionPartProvider {

	@Override
	public IPropertiesEditionPart getPropertiesEditionPart(Object key,
			int kind, IPropertiesEditionComponent component) {
		IPropertiesEditionPart part = super.getPropertiesEditionPart(key, kind,
				component);
		final DummyReferencesTableListener dummy = new DummyReferencesTableListener();
		if (part instanceof StatePropertiesEditionPartForm) {
			part = new StatePropertiesEditionPartForm(component) {

				public void createControls(final FormToolkit widgetFactory,
						Composite view) {
					super.createControls(widgetFactory, view);
					actions.setEnabled(false);
					actions.addTableReferenceListener(dummy);
					transitions.setEnabled(false);
					transitions.addTableReferenceListener(dummy);
				}
			};
		} else if (part instanceof TransitionPropertiesEditionPartForm) {
			part = new TransitionPropertiesEditionPartForm(component) {

				public void createControls(final FormToolkit widgetFactory,
						Composite view) {
					super.createControls(widgetFactory, view);
					state.setEnabled(false);
				}
			};
		}
		return part;
	}
}
