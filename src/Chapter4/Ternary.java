package Chapter4;

public class Ternary {
    public static void main(String[] args) {
        // ? նշանի կիրառություն
        int i, k;
        i = 10;
        k = i < 0 ? -i : i;//ստանալ i բացարձակ արժեք
        System.out.print("բացարձակ արժեք ");
        System.out.println(i + " հավասար է " + k);
        i = -10;
        k = i < 0 ? -i : i;// ստանալ i փոփոխականի բացարձակ արժեք
        System.out.print("բացարձակ արժեք");
        System.out.print("բացարձակ արժեք");
        System.out.println(i+" հավասար է " +k);
    }
}
