package Homework6;

public class ArrayUtil {
    void maxOfArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        System.out.println("max=" + max);

        System.out.println();

    }

    void minOfArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min= " + min);

        System.out.println();
    }

    void allOfArray(int[] array) {
        int[] all = {2, 5, 8, 10, 88, 22, 11, 66, 12, 30, 6, 4, 3};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    void firtsOfArray(int[] array) {
        int[] all = {2, 5, 8, 10, 88, 22, 11, 66, 12, 30, 6, 4, 3};
        System.out.println();
        System.out.print("first element is " + array[0]);
        System.out.println();

    }


    void lastOfArray(int[] array) {
        int[] all = {2, 5, 8, 10, 88, 22, 11, 66, 12, 30, 6, 4, 3};
        int lastIndex = array.length - 1;
        {
            System.out.println();
            System.out.print("last element is " + array[lastIndex]);

        }
        System.out.println();

        System.out.println();


    }

    void evenOfArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + ", ");
            }

        }
        System.out.println();
        System.out.println();
    }

    void eddOfArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ,");
            }
        }

        System.out.println();

        System.out.println();
    }

    void evenNumbersOfArray(int[] array) {
        int y = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                y++;
            }

        }
        System.out.println("even numbers is  " + y);

        System.out.println();

    }

    void oddNumbersOfArray(int[] array) {
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                x++;
            }

        }
        System.out.println("odd numbers is " + x);

        System.out.println();

    }

    void halfIndexOfArray(int[] array) {
        int HalfIndex = array.length / 2;
        {
            System.out.println("half element is " + array[HalfIndex]);
        }

        System.out.println();


    }

    void averageOfArray(int[] array) {
        int nums[] = {2, 5, 8, 10, 88, 22, 11, 66, 12, 30, 6, 4, 3};
        int result = 0;
        for (int i = 0; i < array.length; i++)
            result = result + nums[i];
        {
            System.out.println("the avarage arithmetic mean is equal to " + result / array.length);
        }

        System.out.println();
    }
}





