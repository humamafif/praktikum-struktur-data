package Praktikum.Modul10.Graph;

public class Stack {
    private int maxSize, top;
    private int[] stackArray;

    public Stack (int size){
        this.maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int item){
        stackArray[++top] = item;
    }

    public int pop(){
        return stackArray[top--];
    }

    public int peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == - 1);
    }

    public boolean isFull(){
        return (top == maxSize - 1);
    }
}
