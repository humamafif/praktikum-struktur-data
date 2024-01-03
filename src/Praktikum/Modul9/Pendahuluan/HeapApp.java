package Praktikum.Modul9.Pendahuluan;

public class HeapApp {
    public static void main(String[] args) {
        Heap app = new Heap(35);
        app.insert(1);
        app.insert(2);
        app.insert(3);
        app.insert(4);
        app.insert(5);
        app.insert(6);
        app.insert(7);
        app.insert(8);
        app.insert(9);
        app.insert(10);
        app.insert(11);
        app.insert(12);

        System.out.println(">> Sebelum <<");
        app.displayHeap();

//        System.out.println("\n>> Sesudah <<");
//        app.insert(24);
//        app.insert(22);
//        app.displayHeap();

//        System.out.println("\n>> Remove <<");
//        app.remove();
//        app.displayHeap();

        System.out.println(">> Change <<");
        app.change(1, 99);
        app.displayHeap();
    }
}
