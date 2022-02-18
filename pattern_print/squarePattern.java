package pattern_print;

import java.util.Scanner;

public class squarePattern {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.printf("Enter number of rows : ");
        int nor = userInput.nextInt();

        for (int i = 0; i <= nor; i++){
            for (int j = 0; j <= nor; j++){
                    System.out.printf(" * ");
            }
            System.out.printf("\n");
        }
    }
}
