package pattern_print;

import java.util.Scanner;
public class FloydTriangle {
    public static void floydtriangle(int n){
        int i = 1, j = 1, k = 1;
        for (i = 1; i<= n;i++){
            for (j = 1; j <= i; j++){
                System.out.print(" " + k + " ");
                k++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int numberOfRows = input.nextInt();
        floydtriangle(numberOfRows);
    }
}
