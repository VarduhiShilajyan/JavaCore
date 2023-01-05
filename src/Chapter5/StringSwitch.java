package Chapter5;

public class StringSwitch {
    public static void main(String[] args) {
        String str = "two";
        switch (str) {
            case "one": {
                System.out.println("one");
            }
            break;
            case "two": {
                System.out.println("two");
            }
            break;
            case " tree": {
                System.out.println("thre");
            }
            break;
            default: {
                System.out.println("dose not match");// չի հմապաատասխանում
            }
            break;

        }
    }
}
