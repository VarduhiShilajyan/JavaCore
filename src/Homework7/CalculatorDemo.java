package Homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator cl = new Calculator();
        double plus = cl.plus(2, 3);
        System.out.println(plus);
        double minus = cl.minus(5, 9);
        System.out.println(minus);
        double multiply = cl.multiply(6, 10);
        System.out.println(multiply);
        double divide = cl.divide(6, 0);
        System.out.println(divide);


    }


}


