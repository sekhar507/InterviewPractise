/**
 * 
 */
package com.java8.forEach;

import java.util.ArrayList;
import java.util.List;

/**
 * ForEachFullImplementation.java
 * 
 * @author HemaSekhar Boddu
 *
 * 
 */
/*
 * class ConsumerImpl implements Consumer<String> {
 * 
 * (non-Javadoc)
 * 
 * @see java.util.function.Consumer#accept(java.lang.Object)
 * 
 * @Override public void accept(String i) { System.out.println( i);
 * 
 * }
 * 
 * 
 * }
 */

public class ForEachFullImplementation {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Sekhar");
		names.add("Gayathri");
		names.add("Navya");
		names.add("Ammu");
		names.add("Tulasi");
		names.add("Nissi");

		/*
		 * Consumer<String> c=new Consumer<String>(){ public void accept(String
		 * i) { System.out.println(i); } }; names.forEach(c);
		 */
		names.forEach(i -> System.out.println(i));
		//names.forEach(System.out::println);

	}

}
