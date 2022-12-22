package Homework1;

public class IfForExample {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        if (a > b) {
            System.out.println("տպել : "+a);
        } else {
            System.out.println( "տպել " +b);
        }
    }

    public static class Figure3 {
        public static void main(String[] args) {
            for (int i = 5; i >= 0; i--) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(" * ");
                }
                    System.out.println();
                }

            }
        }
}
