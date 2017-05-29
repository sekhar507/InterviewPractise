package com.java8.interfaces.defaultmethod;

/**
 * phon.java
 * 
 * @author HemaSekhar Boddu
 *
 * 
 */
public interface PhoneInterface {
	/*
	 * default void call(){ System.out.println("Im in the interface"); }
	 */
	
	// All the methods in interface are public abstract by default
	
	public void call();
	
	// java8  to define the default methods in interface as follows 
	
	default void message()
	{
		System.out.println("Im in the interface defined method in the interface...");
	}
	
}
