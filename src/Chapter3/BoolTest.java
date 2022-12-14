package Chapter3;

public class BoolTest {

    public static void main(String[] args) {
        boolean b;
        b = false;
        {
            System.out.println("b հավասար է" + b);
        }
        b = true;
        {
            System.out.println("b հավասար է" + b);
        }
        // boolean օպերատորի պիպը կարող է ղեկավարվել նաև  if օպերատորի միջոցով
        if (b) {
            System.out.println("այս կոդը կթողարկվի");
            // boolean-ի նշանակության և հավասարության արդյունքն է
            System.out.println("10 > 9 հավասար է " + (10>9));
        }
    }
}
