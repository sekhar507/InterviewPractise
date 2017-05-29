/**
 * 
 */
package oh.first;

import java.util.Scanner;

/**
 * InsertionSort.java
 * 
 * @author HemaSekhar Boddu
 *
 * 
 */
public class InsertionSort {
	public static void main(String[] args) {
		int i, j, n, temp, hole;
		System.out.println("Please Entere The size of An Array :: ");
		Scanner toread = new Scanner(System.in);
		n = toread.nextInt();
		int[] array = new int[n];
		System.out.println("Please Enter The Elements to Sort :: ");
		for (i = 0; i < n; i++) {
			array[i] = toread.nextInt();
		}
		for (i = 1; i < n; i++) {
			temp = array[i];
			hole = i;
			while (hole > 0 && array[i - 1] > temp) {
				array[hole] = array[hole - 1];
				hole = hole - 1;

			}
			array[hole] = temp;

		}
		System.out.println("After Sorting ....");
		for (i = 0; i < n; i++)

		{
			System.out.println(array[i]);
		}

	}

}
