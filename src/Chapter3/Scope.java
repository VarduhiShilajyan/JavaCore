package Chapter3;

public class Scope {
    public static void main(String[] args) {

        int x; // այս փոփոխությունը հասանելի է main () մեթոդի բոլոր կոդերին

        x = 10;
        if (x == 10) { // գործողության նոր շրջան
            int y = 20;// հասանելի է միայն տվյալ կոդի բլոքին,
            // երկու փոփոխականներն էլ  հասանելի են տվյալ տիրույթի համար
            System.out.println("x և y :" + x + " " + y);
            x = y * 2;}
        // y=100; // Սխալ!!! y փոփոխականը հասանելի չէ, այս տիրույթում
        //այն դեպքում , երբ x այստեղ հասանելի է
        System.out.println("x հավասար է " + x );
        }
    }
