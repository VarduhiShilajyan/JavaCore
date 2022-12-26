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
        System.out.println("last element is " + array[lastIndex]);

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
        System.out.println("even numbers is  " + y);

        System.out.println();

        //տպել կենտ թվերի քնակը

        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                x++;
            }

        }
        System.out.println("odd numbers is " + x);

        System.out.println();

        int HalfIndex = array.length / 2;
        {
            System.out.println("half element is " + array[HalfIndex]);
        }

        System.out.println();

        //մասիվի միջին թվաբանական

        double nums[] = {1, 13, 5, -10, 20};
        double result = 0;
        for (int i = 0; i < array.length; i++)
            result = result + nums[i];
        {
            System.out.println("the arithmetic mean is equal to " + result / array.length);
        }

        System.out.println( );




    }


}













