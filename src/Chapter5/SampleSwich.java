package Chapter5;

public class SampleSwich {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++)
            switch (i) {
                case 0: {
                    System.out.println("i is equal to zero ");// i հավասար է 0
                    break;
                }
                case 1: {
                    System.out.println("i is equal to 1");//i հավասար է 1
                }
                break;
                case 2: {
                    System.out.println("i is equal to 2");//i հավասար է 2
                }
                break;
                case 3: {
                    System.out.println("i is equal to 3");// i հավասար է 3
                }
                break;
                default: {
                    System.out.println("i is greater than 3");// i մեծ է 3-ից

                }

            }

    }
}
