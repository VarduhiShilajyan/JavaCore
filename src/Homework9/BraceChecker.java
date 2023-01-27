package Homework9;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
        // System.out.println(text);
    }

    public void check() {
        Stack myStack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '[':
                case '{':
                case '(':
                    myStack.push(c);
                case ']':
                    char end = (char) myStack.pop();
                    if (end != '[') {
                        System.out.println("Error opened " + end + " but closed " + end);
                    }
                case '}':
                     end = (char) myStack.pop();
                    if (end != '{') {
                        System.out.println("Error opened " + c + " but closed " + end + " " + c);
                    }
                case ')':
                     end = (char) myStack.pop();
                    if (end != '(') {
                        System.out.println("Error closed " + c + " but opened " + end+ " "+ i);
                    }
                    System.out.println();
                    break;

            }


        }


    }
}

















