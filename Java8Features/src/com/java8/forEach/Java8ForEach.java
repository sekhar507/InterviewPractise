/**
 * 
 */
package com.java8.forEach;

import java.util.ArrayList;
import java.util.List;

/**Java8ForEach.java
 * @author 
   HemaSekhar Boddu
 *
 * 
 */
public class Java8ForEach {
	public static void main(String[] args) {
		
		
		List<String> names=new ArrayList<String>();
		names.add("Sekhar");
		names.add("Gayathri");
		names.add("Navya");
		names.add("Ammu");
		names.add("Tulasi");
		names.add("Nissi");
		//Normal For Loop 
		// External Loops
	/*	for(int i=0;i<names.size();i++){
			System.out.println(names.get(i));
		}*/
		
		//ForEach loop
		/*for(String print:names)
		{
			System.out.println(print);
		}*/
		
		/*For loop and For Each Loops are External Loops 
		Java 8 providing ForEach Internal Loop*/
	names.forEach(i -> System.out.println(i)); // Lambda Expression
	//consumer Interface
		
	}

}
