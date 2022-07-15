package Patterns;

import java.util.Scanner;

public class RightAngleTriangle {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number Of Rows : ");
		int numberOfRow = input.nextInt();
		
		RightAngleTriangle01(numberOfRow);
		System.out.println();
		
		RightAngleTriangle02(numberOfRow);
		System.out.println();
		
		RightAngleTriangle03(numberOfRow);
		System.out.println();
		
		RightAngleTriangle04(numberOfRow);
		System.out.println();
		input.close();
	}
	
	public static void RightAngleTriangle01(int numberOfRow) {
		
		for (int i = 1; i <= numberOfRow; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void RightAngleTriangle02(int numberOfRow) {
		
		for (int i = 1; i <= numberOfRow; i++) {
			for (int j = 1; j <= numberOfRow; j++) {
				
				if (j >= numberOfRow - i + 1 )
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		
	}
	
	public static void RightAngleTriangle03(int numberOfRow) {
		
		for (int i = 1; i <= numberOfRow; i++) {
			for (int j = 1; j <= numberOfRow; j++) {
				
				if (j <= numberOfRow - i + 1 )
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		
	}
	
	public static void RightAngleTriangle04(int numberOfRow) {
		
		for (int i = 1; i <= numberOfRow; i++) {
			for (int j = 1; j <= numberOfRow; j++) {
				
				if (j >= i)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		
	}
	
}
