package Chapter3;

import java.sql.SQLOutput;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        {
            System.out.println("int փոփոխականի վերափոխումը byte. ");
            b = (byte) i;
            System.out.println(" i և b " + i + "" + b);
            System.out.println("double-ի վերափոխումը int ");
            i = (int) d;
            System.out.println(" d և i " + d + "" + i  );
            System.out.println("double-ի վերափոխումը byte. ");
            b = (byte) d;
            System.out.println(" d և b " + d + "" + b);

        }

    }
}
