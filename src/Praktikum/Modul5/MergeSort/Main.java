package Praktikum.Modul5.MergeSort;

public class Main {
    public static void main(String[] args) {

        Merge app = new Merge(10);
        app.insert(10);
        app.insert(6);
        app.insert(80);
        app.insert(20);
        app.insert(30);
        app.insert(90);
        app.insert(2);
        app.insert(50);
        app.insert(23);
        app.insert(33);

        System.out.println("Sebelum Diurut :");
        app.display();

        System.out.println("Setelah Diurut :");
        app.mergeSort();
        app.display();
    }
}
