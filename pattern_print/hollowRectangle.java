package pattern_print;

import java.util.Scanner;
public class hollowRectangle {

    public static void printrectangle (int l, int m){
        for (int i = 1; i <= l; i++){
            for (int j = 1; j <= m; j++){
                if (i == 1 || i == l || j == 1 || j == m)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int length = input.nextInt();
    int breadth = input.nextInt();
    printrectangle (length, breadth);
    }
}
