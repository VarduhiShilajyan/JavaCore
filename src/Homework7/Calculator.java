package Homework7;

public class Calculator {
    void plusOfArray(int[] array) {
        for (double c = 0; c < array.length; c++) {
            for (double b = 0; b < array.length; b++) {
                double plus = c + b;
                System.out.println("գումարը հավասարէ  " + plus);
            }

        }
        System.out.println();

    }

    void multiplyOfArray(int[] array) {
        for (double c = 1; c < array.length; c++) {
            for (double b = 1; b < array.length; b++) {
                double multiply = c * b;
                System.out.print("արտադրյալը հավասար է   " + multiply);
            }
            System.out.println();
        }
    }

    void minusOfArray(int[] array) {
        for (int c = 0; c < array.length; c++) {
            for (double b = 1; b < array.length; b++) {
                double minus = c - b;
                System.out.println(" տարբերությունը հավասար է  " + minus);

            }
            System.out.println();

        }
    }

    void divideOfArray(int[] array) {
        for (int c = 0; c < array.length; c++) {
            for (double b = 1; b < array.length; b++) {
                double divide = c % b;
                System.out.println("քանորդը հավասարն է  " + divide);
            }
        }
    }

    void minus1OfArray(int[] array) {
        for (int c = 0; c < array.length; c++) {
            for (double b = 1; b < array.length; b++) {
                double minus1 = b - c;
                System.out.println("տարբերությունը հավասար  է  " + minus1);
            }
        }
    }

    void divide1OfArray(int[] array) {
        for (int c = 1; c < array.length; c++) {
            for (double b = 0; b < array.length; b++) {
                double divide1 = b % c;
                System.out.println("քանորդը հավասար է  " + divide1);
            }
        }
    }
}










