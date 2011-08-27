/*************************************************************************************
 *
 * Generated on Sat Aug 27 20:37:41 CEST 2011 by XSpray FeatureProvider.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.xspray.examples.mod4j.diagram;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICopyFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDirectEditingFeature;
import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.IPasteFeature;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICopyContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IPasteContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.features.DefaultDeleteFeature;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.xspray.runtime.containers.OwnerPropertyDeleteFeature;

import org.xspray.examples.mod4j.features.mod4jAddBusinessClassFeature;    // 1
import org.xspray.examples.mod4j.features.mod4jCreateBusinessClassFeature; 
import org.xspray.examples.mod4j.features.mod4jUpdateBusinessClassFeature; // 3
import org.xspray.examples.mod4j.features.mod4jAddAssociationFeature;    // 1
import org.xspray.examples.mod4j.features.mod4jCreateAssociationFeature; 
import org.xspray.examples.mod4j.features.mod4jUpdateAssociationFeature; // 3
import org.xspray.examples.mod4j.features.mod4jLayoutBusinessClassFeature; // 4
import org.xspray.examples.mod4j.features.mod4jUpdateBusinessClasspropertiesFeature; // 5
import org.xspray.examples.mod4j.features.mod4jCreateBusinessClasspropertiesBoolPropertyFeature; // 6
import org.xspray.examples.mod4j.features.mod4jCreateBusinessClasspropertiesDateTimePropertyFeature; // 6
import org.xspray.examples.mod4j.features.mod4jCreateBusinessClasspropertiesEnumerationPropertyFeature; // 6
import org.xspray.examples.mod4j.features.mod4jCreateBusinessClasspropertiesIntegerPropertyFeature; // 6
import org.xspray.examples.mod4j.features.mod4jCreateBusinessClasspropertiesStringPropertyFeature; // 6
import org.xspray.examples.mod4j.features.mod4jCreateBusinessClasspropertiesBlobBinaryPropertyFeature; // 6
import org.xspray.examples.mod4j.features.mod4jCreateBusinessClasspropertiesBlobTextPropertyFeature; // 6
import org.xspray.examples.mod4j.features.mod4jCreateBusinessClasspropertiesDecimalPropertyFeature; // 6
import org.xspray.examples.mod4j.features.mod4jUpdateBusinessClassbusinessRulesFeature; // 5
import org.xspray.examples.mod4j.features.mod4jCreateBusinessClassbusinessRulesUniqueRuleFeature; // 6
import org.xspray.examples.mod4j.features.mod4jCreateBusinessClassbusinessRulesBusinessRuleFeature; // 6
import BusinessDomainDsl.impl.BusinessClassImpl; // 7
import BusinessDomainDsl.BusinessClass; // 77
import org.xspray.examples.mod4j.features.mod4jAddReferenceBusinessClasssuperclassFeature; // 8
import org.xspray.examples.mod4j.features.mod4jCreateBusinessClasssuperclassFeature;
import org.xspray.examples.mod4j.features.mod4jDeleteReferenceBusinessClasssuperclassFeature;
import BusinessDomainDsl.Property;
import org.xspray.examples.mod4j.features.mod4jAddBusinessClasspropertiesListFeature; // 9
import BusinessDomainDsl.AbstractBusinessRule;
import org.xspray.examples.mod4j.features.mod4jAddBusinessClassbusinessRulesListFeature; // 9
import BusinessDomainDsl.impl.AssociationImpl; // 7
import BusinessDomainDsl.Association; // 77
// import all custom features
import org.xspray.examples.mod4j.features.mod4jCustomFeature;// true
import org.xspray.examples.mod4j.features.mod4jCustomDoWithBusinessClassFeature;// true


public class mod4jFeatureProviderBase extends DefaultFeatureProvider {

	public mod4jFeatureProviderBase(IDiagramTypeProvider dtp) {
		super(dtp);
	}

	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		// is object for add request a EClass or EReference?
		Object object = context.getNewObject() ;
		String reference = (String)context.getProperty("REFERENCE");
		
		if ( isBusinessClass(object) ) {
		            if ( reference == null ){
				return new mod4jAddBusinessClassFeature(this);
			            } else if( reference.equals("superclass")){
			                return new mod4jAddReferenceBusinessClasssuperclassFeature(this);
			}
		} 
if( object instanceof Property ){
	return new mod4jAddBusinessClasspropertiesListFeature(this);
}
if( object instanceof AbstractBusinessRule ){
	return new mod4jAddBusinessClassbusinessRulesListFeature(this);
}
		if ( isAssociation(object) ) {
		            if ( reference == null ){
				return new mod4jAddAssociationFeature(this);
			}
		} 
		return super.getAddFeature(context);
	}
	
	@Override
	public ICreateFeature[] getCreateFeatures() {
		return new ICreateFeature[] { 
		new mod4jCreateBusinessClassFeature(this) 
, new mod4jCreateBusinessClasspropertiesBoolPropertyFeature(this)
, new mod4jCreateBusinessClasspropertiesDateTimePropertyFeature(this)
, new mod4jCreateBusinessClasspropertiesEnumerationPropertyFeature(this)
, new mod4jCreateBusinessClasspropertiesIntegerPropertyFeature(this)
, new mod4jCreateBusinessClasspropertiesStringPropertyFeature(this)
, new mod4jCreateBusinessClasspropertiesBlobBinaryPropertyFeature(this)
, new mod4jCreateBusinessClasspropertiesBlobTextPropertyFeature(this)
, new mod4jCreateBusinessClasspropertiesDecimalPropertyFeature(this)
, new mod4jCreateBusinessClassbusinessRulesUniqueRuleFeature(this)
, new mod4jCreateBusinessClassbusinessRulesBusinessRuleFeature(this)
		};
	}

	@Override
	public IUpdateFeature getUpdateFeature(IUpdateContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
	//	if (pictogramElement instanceof ContainerShape) {
			Object bo = getBusinessObjectForPictogramElement(pictogramElement);
if ( isBusinessClass(bo) ) { // 11
						return new mod4jUpdateBusinessClassFeature(this); 
					}
if (bo instanceof Property) { // 22
	return new mod4jUpdateBusinessClasspropertiesFeature(this); 
}
if (bo instanceof AbstractBusinessRule) { // 22
	return new mod4jUpdateBusinessClassbusinessRulesFeature(this); 
}
if (bo instanceof Association) { // 33
	return new mod4jUpdateAssociationFeature(this); 
}
//		}
		return super.getUpdateFeature(context);
	}

	@Override
	public ILayoutFeature getLayoutFeature(ILayoutContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
if ( isBusinessClass(bo) ) {
					return new mod4jLayoutBusinessClassFeature(this);
				}
		return super.getLayoutFeature(context);
	}

    @Override
    public ICreateConnectionFeature[] getCreateConnectionFeatures() {
		return new ICreateConnectionFeature[] { 
		new mod4jCreateAssociationFeature(this) 
		,
new mod4jCreateBusinessClasssuperclassFeature(this) ,
		};
    }

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.graphiti.features.edit.IFeatureProvider#getDeleteFeatures()
	 */
	@Override
	public IDeleteFeature getDeleteFeature(IDeleteContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		String reference = Graphiti.getPeService().getPropertyValue(pictogramElement, "REFERENCE");

		        if ( isBusinessClass(bo) ) {
			if( reference == null ){
				return new DefaultDeleteFeature(this); 
			} else if( reference.equals("superclass")){
				return new mod4jDeleteReferenceBusinessClasssuperclassFeature(this);
			}
		} 
if( bo instanceof Property ){
	return new OwnerPropertyDeleteFeature(this);
}
if( bo instanceof AbstractBusinessRule ){
	return new OwnerPropertyDeleteFeature(this);
}
		        if ( isAssociation(bo) ) {
			if( reference == null ){
				return new DefaultDeleteFeature(this); 
			}
		} 
		
		return new DefaultDeleteFeature(this); 
	}

	/** Ensure that any shape with property CAN_MOVE set to false will not have a move feature.
	 */
	@Override
	public IMoveShapeFeature getMoveShapeFeature(IMoveShapeContext context) {
		Shape s = context.getShape();
		String stat  = Graphiti.getPeService().getPropertyValue(s, "CAN_MOVE");
		if( (stat != null) && (stat.equals("false") )){
			return null;
		}
		return super.getMoveShapeFeature(context);
	}

    @Override
    public ICustomFeature[] getCustomFeatures(ICustomContext context) {
        Object bo = getBusinessObjectForPictogramElement(context.getPictogramElements()[0]);
			            if( isBusinessClass(bo)  ){
return new ICustomFeature[]{ 
new mod4jCustomDoWithBusinessClassFeature(this) // true
};
}
			            if( isAssociation(bo)  ){
return new ICustomFeature[]{ 
};
}
        return new ICustomFeature[]{ };
    }

/** Check the type of the domain object 'object'
 */
protected boolean isBusinessClass(Object object){
    if ( (object instanceof BusinessClassImpl) && object.getClass().getSimpleName().equals("BusinessClassImpl") ) {
        return true;
    } else {
        return false;
    }
}
/** Check the type of the domain object 'object'
 */
protected boolean isAssociation(Object object){
    if ( (object instanceof AssociationImpl) && object.getClass().getSimpleName().equals("AssociationImpl") ) {
        return true;
    } else {
        return false;
    }
}
}
