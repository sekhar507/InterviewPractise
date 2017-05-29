/**
 * 
 */
package oh.first;

import java.util.Scanner;

/**BinaryToDecimal.java
 * @author 
   HemaSekhar Boddu
 *
 * 
 */
public class BinaryToDecimal {
	public static void main(String[] args) {
		System.out.println("Please Enter Decimal Number :: ");
		Scanner toread=new Scanner(System.in);
		int binary=toread.nextInt();
		int power=0;
		int decimal=0;
		while(binary>0)
		{
			decimal+=(binary%10)*Math.pow(2, power++);
			binary=binary/10;
			
		}
		System.out.println(decimal);
	}

}
