package Chapter2;

import java.sql.SQLOutput;

public class BlockTest {
    public static void main(String[] args) {

        int x, y;

        y = 20;
        //ցիկրի օպերատորի այս հասցեն ծառայում է որպես կոդի բլոք

        for (x = 0; x < 10; x++) {

            System.out.println("x արժեքը։" + x);

            System.out.println("yարժեքը։" + y);

            y = y - 2;
        }
    }
}
