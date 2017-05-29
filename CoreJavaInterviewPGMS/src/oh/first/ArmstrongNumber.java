/**
 * 
 */
package oh.first;

import java.util.Scanner;

/**ArmstrongNumber.java
 * @author 
   HemaSekhar Boddu
 *
 * 
 */
public class ArmstrongNumber {
	public static void main(String[] args) {
		int c=0;
		System.out.println("Please Enter The number :: ");
		Scanner toread=new Scanner(System.in);
		int n=toread.nextInt();
		int temp=n;
		while(n>0)
		{
			int a=n%10;
			n=n/10;
			c=c+(a*a*a);
			
			
		}
		if(temp==c)
		{
			System.out.println("Your Number is ArmStrong Numnber::");
		}
		else
			System.out.println("!!!!!!!Your number is Not ArmStrong....");
	}
}
