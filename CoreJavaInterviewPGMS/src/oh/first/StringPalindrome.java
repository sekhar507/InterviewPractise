/**
 * 
 */
package oh.first;

import java.util.Scanner;

/**StringPalindrome.java
 * @author 
   HemaSekhar Boddu
 *
 * 
 */
public class StringPalindrome {
	public static void main(String[] args) {
		System.out.println("Enter Your String :: ");
		Scanner toread=new Scanner(System.in);
		String str1=toread.next();
		String str2=new StringBuffer(str1).reverse().toString();
		if(str1.equals(str2))
		{
			System.out.println("Your String is Palindrome::");
		}
		else
			System.out.println("Your String is Not A Palindrome ::");
	}

}
