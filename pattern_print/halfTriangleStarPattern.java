package pattern_print;

import java.util.Scanner;

public class halfTriangleStarPattern {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int nor = userInput.nextInt();

        for (int i = 0; i <= nor; i++){
            for (int j = 0; j <= i; j++){
                if (j < i)
                    System.out.print(" * ");
                else
                    System.out.printf(" ");
            }
            System.out.println();
        }
    }

}