/**
 * 
 */
package oh.first;

import java.util.Scanner;

/**
 * FibSeries.java
 * 
 * @author HemaSekhar Boddu
 *
 * 
 */
public class FibSeries {
	public static void main(String[] args) {
		System.out.println("Enter n Value");
		Scanner toread = new Scanner(System.in);
		int n = toread.nextInt();
		int f1 = 0, f2 = 1, f3;
		if(n==1||n==2){
			System.out.println("1");
			
		}else{
		for (int i = 2; i < n; i++) {
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			System.out.println(f3);
		}
		}

	}

}
