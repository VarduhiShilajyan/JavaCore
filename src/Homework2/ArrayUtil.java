package Homework2;

public class ArrayUtil {

    public static void main(String[] args) {
        int[] array = {1, 13, 5, -10};
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + " ; ");
        }
        System.out.println();

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                {
                    System.out.println(max);
                }
            }

        }
        int min = array[0];
        for (int i = array[0]; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                System.out.println(min);
            }

        }

    }
}





