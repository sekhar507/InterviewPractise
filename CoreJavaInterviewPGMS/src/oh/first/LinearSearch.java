package oh.first;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int n, i, j;

		System.out.println("Please Enter How Many Numbers You wanna Enter:: ");
		Scanner toread = new Scanner(System.in);
		n = toread.nextInt();
		int[] array = new int[n];
		System.out.println("Please Enter  The Elements :: ");
		for (i = 0; i < n; i++) {
			array[i] = toread.nextInt();
		}
		System.out.println("Please Enter The searching Element :: ");
		int search = toread.nextInt();
		for (i = 0; i < n; i++) {
			if (array[i] == search) {
				System.out.println("Your element is Located at :: " + (i + 1));
				break;
			}

		}
		if (i == n) {
			System.out.println("Sorry Element Not Found:: ");
		}

	}
}