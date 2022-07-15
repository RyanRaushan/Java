package Patterns;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter Number Of Rows : ");
		int numberOfRow = input.nextInt();

		numberPattern01(numberOfRow);
		numberPattern02(numberOfRow);
		numberPattern03(numberOfRow);
		input.close();
	}

	public static void numberPattern01(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(j);

			}
			System.out.println();
		}

	}

	public static void numberPattern02(int n) {
		for (int i = 1; i <= n; i++) {
			int k = 1;
			for (int j = 1; j <= n; j++) {

				if (j <= n - i + 1 ) {
					System.out.print(k);
					k++;
				}
				else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}
	
	public static void numberPattern03(int n) {
		
		int k = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(k + " ");
				k++;

			}
			System.out.println();
		}

	}

}
