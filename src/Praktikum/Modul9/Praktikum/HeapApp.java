package Praktikum.Modul9.Praktikum;

public class HeapApp {
    public static void main(String[] args) {
        Heap app = new Heap(4);
        app.insert(3);
        app.insert(1);
        app.insert(7);
        app.insert(4);

        System.out.println("\nSebelum diurutkan");
        app.displayArray();

        System.out.println("\nSesudah diurutkan");
        app.heapSort();
        app.displayArray();
    }
}