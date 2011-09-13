/**
 * Generated with Acceleo
 */
package org.eclipse.xtext.example.fowlerdsl.statemachine.parts;

/**
 * 
 * 
 */
public class StatemachineViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * Statemachine view descriptor
	 * 
	 */
	public static class Statemachine_ {
		public static class Properties {
	
			
			public static String events = "statemachine::Statemachine_::properties::events";
			
			
			public static String resetEvents = "statemachine::Statemachine_::properties::resetEvents";
			
			
			public static String commands = "statemachine::Statemachine_::properties::commands";
			
			
			public static String states = "statemachine::Statemachine_::properties::states";
			
	
		}
	
	}

	/**
	 * Event view descriptor
	 * 
	 */
	public static class Event {
		public static class Properties {
	
			
			public static String name = "statemachine::Event::properties::name";
			
			
			public static String code = "statemachine::Event::properties::code";
			
	
		}
	
	}

	/**
	 * Command view descriptor
	 * 
	 */
	public static class Command {
		public static class Properties {
	
			
			public static String name = "statemachine::Command::properties::name";
			
			
			public static String code = "statemachine::Command::properties::code";
			
	
		}
	
	}

	/**
	 * State view descriptor
	 * 
	 */
	public static class State {
		public static class Properties {
	
			
			public static String name = "statemachine::State::properties::name";
			
			
			public static String actions = "statemachine::State::properties::actions";
			
			
			public static String transitions = "statemachine::State::properties::transitions";
			
	
		}
	
	}

	/**
	 * Transition view descriptor
	 * 
	 */
	public static class Transition {
		public static class Properties {
	
			
			public static String event = "statemachine::Transition::properties::event";
			
			
			public static String state = "statemachine::Transition::properties::state";
			
	
		}
	
	}

}
