package Homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();
        dy.add(23);
        dy.add(56);
        dy.add(6);
        dy.add(10);
        dy.add(30);
        dy.add(90);
        dy.add(20);
        dy.add(15);
        dy.add(10);
        System.out.println(dy.getByIndex(-2));
        dy.print();
        dy.deleteByIndex(5);
        dy.print();
        dy.set(0, 0);
        dy.print();
        dy.add(3, 88);
        dy.print();
        System.out.println();
        System.out.println(dy.exists(1563));
       // dy.print();
        System.out.println(dy.getIndexByValue(4));


    }

}
