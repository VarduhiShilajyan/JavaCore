package Homework8;


public class DynamicArray {
    //  մեր հիմնական մասիվն է բաղկացած 10 էլեմենտից
    int[] array = new int[10];

    int size = 0; //մասիվի մեջ ավելացրած էլեմենտների քանակն է

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {//հին մասիվի սսիլկան կապում ենք նոր ստեղծվածի հետ, ստեղծվել է tmp ժամանակավոր փոփոխական
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {// size = array.lenght
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public int getByIndex(int index) {
        if (index < 0 || index > size - 1) {
            System.out.println(" Wrong index");
            return -1;
        }

        return array[index];
    }


    public void print() {// տպում ենք ավելացրած էլեմենտները
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + ", ");


        }

    }

    public void deleteByIndex(int index) {
        //ջնջել մասիվի index-երորդ էլեմենտը
        //եթե չկա նման ինդեքսով էլեմենտ, տպել, որ չկա նման էլեմենտ
        if (index < 0 || index > size - 1) {
            System.out.println(" Wrong index");
            return;
        }
        for (int i = index; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;
        System.out.println();
    }

    public void set(int index, int value) {
        //տրված value-ն դնելու ենք տրված index-ով էլեմենտի տեղը։
        // Հին արժեքը կկորի
        //եթե նման ինդեքսով էլեմենտ չկա, գրում ենք որ չկա։

        if (index < 0 || index > size - 1) {
            System.out.println(" Wrong index");
            return;
        }
        array[index] = value;
        System.out.println();
    }

    public void add(int index, int value) {
        //ավելացնել տրված value-ն տրված ինդեքսում, իսկ էղած էլեմենտները մի հատ աջ տանել։
        //Եթե չկա նման ինդեքս, տպել որ չկա
        if (index < 0 || index > size - 1) {
            System.out.println(" Wrong index");
            return;
        }
        if (size == array.length) {
            extend();
        }
        for (int i = size; i >= index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        size++;
        System.out.println();
    }

    public boolean exists(int value) {
    //Վերադարձնել true եթե տրված value-ն կա մեր մասիվի մեջ, եթե ոչ false

        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public int getIndexByValue(int value){
        //Վերադարձնել տրված value-ի ինդեքսը, եթե շատ կա տվյալ թվից, վերադարձնել առաջին ինդեքսը։
        //եթե չկա, -1
        for (int i = 0; i < size; i++) {
            if (array[i]==value){
                return i;
            }
        }
        return  -1;
    }
}












    


