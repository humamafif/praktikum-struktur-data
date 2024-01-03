package Praktikum.PrakModul3.prak1;

public class Stack {
    private int maxSize, top;
    private char[] stackArray;

    public Stack(int size){
        this.maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char item){
        stackArray[++top] = item;
    }

    public char pop(){
        return stackArray[top--];
    }

    public char peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == - 1);
    }

    public boolean isFull(){
        return (top == maxSize - 1);
    }

}
