package oh.first;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		int i, n;

		System.out
				.println("Please Enter How many Elements You Wanna Enter :: ");
		Scanner toread = new Scanner(System.in);
		n = toread.nextInt();
		int[] array = new int[n];
		System.out.println("Please Eneter The Elemenets ");
		for (i = 0; i < n; i++) {
			array[i] = toread.nextInt();
		}
		System.out.println("Please Enter The Searching Element:: ");
		int search = toread.nextInt();
		int first = 0;
		int last = n - 1;
		int middle = (first + last) / 2;
		while (first <= last) {
			if (array[middle] < search) {
				first = middle + 1;
			} else if (array[middle] == search) {
				System.out.println("Your Element is Located at :: " + (i + 1));
				break;
			}

			else {
				last = middle - 1;
			}
			middle = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Sorry Element Not Found::");
		}

	}
}