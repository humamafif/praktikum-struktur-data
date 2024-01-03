package Praktikum.PrakModul3.prak2;

public class Queue {
    private int maxSize, front, rear, nItems;
    private String[] queArray;

    public Queue(int size) {
        this.maxSize = size;
        queArray = new String[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(String value) {
        if (isFull()) {
            System.out.println("Maaf " + value+ ", Antrian penuh");
        } else {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            queArray[++rear] = value;
            nItems++;
            System.out.println(value + " Masuk Antrian");
        }

    }

    public String remove() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        } else {
            String temp = queArray[front++];
            if (front == maxSize) {
                front = 0;
            }
            nItems--;
            System.out.println("\n<< "+temp + " keluar antrian");
            return temp;
        }
    }

    public String peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public int size() {
        return nItems;
    }

    public void display() {
        if (isEmpty()){
            System.out.println("Antrian Kosong");
        } else {
            int currentIndex = front;
            System.out.println(">> Isi Antrian :");
            for (int i = 0; i < nItems; i++) {
                System.out.print(queArray[currentIndex] + ", ");
                currentIndex = (currentIndex + 1) % maxSize;
            }
            System.out.println();
        }
    }
}
