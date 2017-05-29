/**
 * 
 */
package oh.first;

import java.util.Scanner;

/**
 * ReverseNumber.java
 * 
 * @author HemaSekhar Boddu
 *
 * 
 */
public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println("Enter your Number");
		@SuppressWarnings("resource")
		Scanner toread = new Scanner(System.in);
		int n=toread.nextInt();
		int reverse=0;
		while(n!=0)
		{
			reverse= reverse*10;
			reverse=reverse+n%10;
			n=n/10;
		}
		System.out.println(reverse);

	}

}