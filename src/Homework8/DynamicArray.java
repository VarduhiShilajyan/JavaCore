package Homework8;

import static jdk.nashorn.internal.objects.NativeJava.extend;

public class DynamicArray {
    //  մեր հիմնական մասիվն է բաղկացած 10 էլեմենտից
    private int[] array = new int[10];

    private int size = 0; //մասիվի մեջ ավելացրած էլեմենտների քանակն է

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }


    private void extend() {//հին մասիվի սսիլկան կապում ենք նոր ստեղծվածի հետ, ստեղծվել է tmp ժամանակավոր փոփոխական
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < size; i++)
            tmp[i] = array[i];

    }

    public int getByIndex(int Index) {
        return 0;
    }

    public void print() {// տպում ենք ավելացրած էլեմենտները
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);


        }
    }

}



