package Homework2;

public class ArrayUtil {

    public static void main(String[] args) {
        int[] array = {1, 13, 5, -10, 20};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        // տպել մեծ թիվը
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max: " + max);

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min: " + min);

        System.out.println();

        System.out.println("second part");

        System.out.println();

        System.out.println("first element is " + array[0]);

        int lastIndex = array.length - 1;
        System.out.println("last elemen is " + array[lastIndex]);

        System.out.println();

        //տպել զույգ էլեմենտները


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }

        }
        System.out.println();

        // տպել կենտ էլեմենտները
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.println(array[i]);
            }
        }


        System.out.println();

        // տպել զույգերի քնակը

        int y = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                y++;
            }

        }
        System.out.println("զույգ թվերի քնակը " + y);

        System.out.println();

        //տպել կենտ թվերի քնակը

        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                x++;
            }

        }
        System.out.println("կենտ թվերի քնակն է " + x);

        System.out.println();


    }


}













