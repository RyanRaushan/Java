package Patterns;

import java.util.Scanner;

public class Rectangle {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number Of Rows : ");
		int numberOfRow = input.nextInt();
		
		for (int i = 1; i <= numberOfRow; i++) {
			for (int j = 1; j <= numberOfRow; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		input.close();
	}

}
