package Homework9;

public class Stack {
    int stck[] = new int[10];
    int tos;

    //սկզբնավորել stack-ի գագաթը
    Stack() {
        tos = -1;

    }

    //տեղավորել էլեմենտտները stack-ի մեջ
    void push(int item) {
        if (tos == 9)
            System.out.println(" Sack-ը լցված է");
        else
            stck[++tos] = item;
    }

    // stack-ից հանել էլեմենտներ
    int pop() {
        if (tos < 0) {
           // System.out.println("Steck-ը բեռնավորված է");
            return 0;
        } else
            return stck[tos--];
    }

}
