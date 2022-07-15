package Patterns;

import java.util.Scanner;

public class Patterns {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter number of Rows : ");
            int numberOfLine = input.nextInt();
            rectangularShapeQue01(numberOfLine);
            System.out.println();
            rightAngleTriangleShapeQue02(numberOfLine);
            System.out.println();
            rightAngleTriangleShapeQue03(numberOfLine);
            System.out.println();
            rightAngleTriangleShapeQue04(numberOfLine);
            System.out.println();
            rightAngleTriangleShapeQue05(numberOfLine);
            System.out.println();
            patternPrintingQue06(numberOfLine);
            System.out.println();
            patternPrintingQue07(numberOfLine);
            System.out.println();
            patternPrintingQue08(numberOfLine);
            System.out.println();
            patternPrintingQue09(numberOfLine);
            System.out.println();
            patternPrintingQue10(numberOfLine);
            System.out.println();
            patternPrintingQue11(numberOfLine);
            input.close();
        }

        public static void rectangularShapeQue01(int n){
            for (int i = 1; i <= n; i++){
                for (int j = 1; j <= n; j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }

        public static void rightAngleTriangleShapeQue02(int n){
            for (int i = 1; i <= n; i++){
                for (int j = 1; j <= n; j++){
                    if (j <= i){
                        System.out.print(" * ");
                    }
                }
                System.out.println();
            }
        }

        public static void rightAngleTriangleShapeQue03(int n){
            for (int i = 1; i <= n; i++){
                for (int j = 1; j <= n; j++){
                    if (j <= n+1 - i){
                        System.out.print(" * ");
                    }
                }
                System.out.println();
            }
        }

        public static void rightAngleTriangleShapeQue04(int n){
            for (int i = 1; i <= n; i++){
                for (int j = 1; j <= n; j++){

                    if (j >= n+1 - i){
                        System.out.print(" * ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }

        public static void rightAngleTriangleShapeQue05(int n){
            for (int i = 1; i <= n; i++){
                for (int j = 1; j <= n; j++){

                    if (j >= i){
                        System.out.print(" * ");
                    }
                    else {
                        System.out.print("   ");
                    }

                }
                System.out.println();
            }
        }

        public static void patternPrintingQue06(int n){
            for (int i = 1; i <= n; i++){
                for (int j = 1; j <= 2*n - 1; j++){

                    if (j >= 2*i - 1 && j <= i+4){
                        System.out.print(" * ");
                    }
                    else {
                        System.out.print("   ");
                    }

                }
                System.out.println();
            }
        }

        public static void patternPrintingQue07(int n){
            for (int i = 1; i <= n; i++){
                for (int j = 1; j <= n; j++){

                    if (j == 1 || i == 1 || j == n || i == n){
                        System.out.print(" * ");
                    }
                    else {
                        System.out.print("   ");
                    }

                }
                System.out.println();
            }
        }

        public static void patternPrintingQue08(int n){
            if (n % 2 == 0){
                System.out.println("Enter a valid input.");
            }
            else {
                int n1 = n/2 + 1;
                for (int i = 1; i <= n1*2 - 1; i++){
                    for (int j = 1; j <= n1*2 - 1; j++){

                        if (j == i || j == n1*2 - i){
                            System.out.print(" * ");
                        }
                        else {
                            System.out.print("   ");
                        }

                    }
                    System.out.println();
                }
            }
        }

        public static void patternPrintingQue09(int n){

            for (int i = 1; i <= n; i++){
                for (int j = 1; j <= 2*n - 1; j++){
                    if (j <= 4 + i && j >= 6 - i){
                        System.out.print(" * ");
                    }
                    else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }

        }

        public static void patternPrintingQue10(int n){

            for (int i = 1; i <= n; i++){
                for (int j = 1; j <= 2*n - 1; j++){

                    if ( j >= i && j <= 10 - i ){
                        System.out.print(" * ");
                    }
                    else {
                        System.out.print("   ");
                    }

                }
                System.out.println();
            }

        }

        public static void patternPrintingQue11 (int n){

            for (int i = 1; i <= n; i++){
                for ( int j = 1; j <= 2 * n - 1; j++ ){

                    if ( j <= 6-i  && j >= 4 + i ){
                        System.out.print(" * ");
                    }
                    else {
                        System.out.print("   ");
                    }

                }
                System.out.println();
            }

        }

    }
