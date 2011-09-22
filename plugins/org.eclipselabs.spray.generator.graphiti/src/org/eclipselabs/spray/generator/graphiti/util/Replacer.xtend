package org.eclipselabs.spray.generator.graphiti.util

import java.util.*
import org.eclipse.emf.ecore.*
import org.eclipse.xtext.xtend2.lib.*
import org.eclipselabs.spray.generator.graphiti.util.*
import org.eclipse.xtext.xbase.lib.*

class Replacer  {
	
	Map<String, Functions$Function1<String, String> > replacements
	    
    def addReplacement(String marker, Functions$Function1<String, String> replacement){
    	if( replacement == null ){
    		println("Replacer ERROR: need to call initalizeReplacement() first")
    		return null
    	}
    	replacements.put(marker, replacement)
    }
    
    def initalizeReplacement() {
    	replacements = new HashMap<String, Functions$Function1<String, String> > ()
    }
    
    def execute(String input ) {
    	var String result = input
    	for(replacement : replacements.entrySet){ 
			result = replacement.value.apply(result)
    	}
    }
	
} 