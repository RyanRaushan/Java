package Patterns;

import java.util.Scanner;

public class Seven {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number Of Rows : ");
		int numberOfRow = input.nextInt();
		
		printSeven(numberOfRow);
		input.close();
		
	}
	
	public static void printSeven(int numberOfRow) {
		
		for (int i = 1; i <= numberOfRow; i++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		for (int i = 2; i <= numberOfRow; i++) {
			for (int j = 1; j <= numberOfRow; j++) {
								
				if (j == numberOfRow - i + 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
