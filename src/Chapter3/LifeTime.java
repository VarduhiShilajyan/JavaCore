package Chapter3;

import java.sql.SQLOutput;

public class LifeTime {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3; x++){
            int y= -1; {
                System.out.println("y հավասար է " +y);
                // այստեղ միշտ հայտնվում է -1 նշանակությունը
                y=100;{
                    System.out.println("y արդեն հավասար է " +y );
                }

            }
        }

    }
}
