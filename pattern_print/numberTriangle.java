package pattern_print;
import java.util.Scanner;
public class numberTriangle {
    public static void numberTriangle(int numberOfRow){
    for (int i = 1; i <= numberOfRow; i++){
        int k = i;
        for (int j = 1; j <= numberOfRow*2-1; j++){
            if (j >= numberOfRow + 1 -i && j <= numberOfRow-1+i){
                System.out.print(" " + k + " ");
                if (j <= (numberOfRow*2-1)/2)
                    k++;
                else
                    k--;
            }
            else
                System.out.print("   ");
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number Of row : ");
    int numberOfRow = input.nextInt();
    numberTriangle(numberOfRow);
    }
}