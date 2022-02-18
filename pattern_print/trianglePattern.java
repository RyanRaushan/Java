package pattern_print;
import java.util.Scanner;

public class trianglePattern {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int nor = userInput.nextInt();
        for (int i = 0; i <= nor; i++)
        {
            for (int j = 0; j <= nor * 2 - 1; j++)
            {
                if (j >= 6 - i && j <= 4 + i)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
