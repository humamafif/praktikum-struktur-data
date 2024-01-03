package Praktikum.Modul3.Stack;

public class StackApp {

    public static void main(String[] args) {
        Stack theStack = new Stack(10);
        System.out.println(">> Push some items");
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        System.out.println("\n>> Pop items in the Stack");
        while (!theStack.isEmpty()){
            long value = theStack.pop();
            System.out.print(value + " ");

        }
        System.out.println();

    }
}
