package Homework7;

public class Calculator {
    double plus(double num1, double num2) {
        return num1 + num2;
    }

    double minus(double num1, double num2) {
        return num1 - num2;
    }

    double multiply(double num1, double num2) {
        return num1 * num2;
    }

    double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("the number is not divisible by 0");
            return -1;
        }
        return num1 / num2;

    }
}





