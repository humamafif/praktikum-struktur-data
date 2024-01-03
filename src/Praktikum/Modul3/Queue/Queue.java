package Praktikum.Modul3.Queue;

public class Queue {
    private int maxSize, front, rear, nItems;
    private long[] queArray;

    public Queue (int size){
        this.maxSize = size;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long value){
        if (rear == maxSize -1){
            rear = -1;
        }

        queArray[++rear] = value;
        nItems++;
    }

    public long remove(){
        long temp = queArray[front++];
        if (front == maxSize){
            front = 0;
        }
        nItems--;
        return temp;
    }

    public long peekFront(){
        return queArray[front];
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }

    public int size(){
        return nItems;
    }
}
