/**
 * 
 */
package oh.first;

import java.util.Scanner;

/**DecimalToBinary.java
 * @author 
   HemaSekhar Boddu
 *
 * 
 */
public class DecimalToBinary {
	public static void main(String[] args) {
		System.out.println("Please Enter Decimal Number :: ");
		Scanner toread=new Scanner(System.in);
		int n=toread.nextInt();
		String binary="";
		while(n>0)
		{
			binary=(n%2)+binary;
			n=n/2;	
		}
		System.out.println(binary);
	}

}
