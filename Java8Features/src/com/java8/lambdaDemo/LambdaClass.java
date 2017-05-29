/**
 * 
 */
package com.java8.lambdaDemo;

/**LambdaClass.java
 * @author 
   HemaSekhar Boddu
 *
 * 
 */
public class LambdaClass {
	public static void main(String[] args) {
		
	//we can create the instance of an  interface
		/* MethodInterface objref=new MethodInterface(){ // Anonymous class
			public void show() {
				System.out.println("Im in the method from interface");
				
			}
			
		};*/
		
		MethodInterface objref;	
		objref=()->
		{
			System.out.println("Im implementing interface methods");
		};
		objref.show();
	}
	
	
}
