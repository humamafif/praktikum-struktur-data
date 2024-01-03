package Praktikum.Modul3.Stack;

public class Stack {
    private int maxSize, top;
    private long[] stackArray;

    public Stack (int size){
        this.maxSize = size;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long item){
        stackArray[++top] = item;
    }

    public long pop(){
        return stackArray[top--];
    }

    public long peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == - 1);
    }

    public boolean isFull(){
        return (top == maxSize - 1);
    }
}
