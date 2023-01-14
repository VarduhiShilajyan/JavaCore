package Homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,};
        Calculator au = new Calculator();
        au.plusOfArray(array);
        au.multiplyOfArray(array);
        au.minusOfArray(array);
        au.divideOfArray(array);
        au.minus1OfArray(array);
        au.divide1OfArray(array);

    }
}

