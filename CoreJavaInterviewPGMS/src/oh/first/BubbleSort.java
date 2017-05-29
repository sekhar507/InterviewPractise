/**
 * 
 */
package oh.first;

import java.util.Scanner;

/**
 * BubbleSort.java
 * 
 * @author HemaSekhar Boddu
 *
 * 
 */
public class BubbleSort {
	public static void main(String[] args) {

		int i, j, n, temp = 0;
		System.out.println("Please Entere The size of An Array :: ");
		Scanner toread = new Scanner(System.in);
		n = toread.nextInt();
		int[] array = new int[n];
		System.out.println("Please Enter The Elements to Sort :: ");
		for (i = 0; i < n; i++) {
			array[i] = toread.nextInt();
		}
		for (i = 0; i < n; i++) {
			for (j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		System.out.println("After Sorting ....");
		for (i = 0; i < n; i++) {
			System.out.println(array[i]);
		}

	}

}
