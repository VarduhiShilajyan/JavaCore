package Homework4;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int j = 0;
        for (int b = 0; b < chars.length; b++) {
            if (chars[b] == c) {
                j = j + 1;
            }

        }
        System.out.println(j);// քանի հատ 'օ' էլեմենտ կա


        System.out.println();

        int halfIndex=(chars.length/2);
        int halfIndex2=((chars.length/2)-1);{
            System.out.println("half elements are  " + chars[halfIndex] + " & " +chars[halfIndex2]);

        }

    }

}

