package Praktikum.Modul6.QuickShort;

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray arr;
        arr = new HighArray(maxSize);
//        arr.insert(42);
//        arr.insert(89);
//        arr.insert(63);
//        arr.insert(12);
//        arr.insert(94);
//        arr.insert(27);
//        arr.insert(78);
//        arr.insert(3);
//        arr.insert(50);
//        arr.insert(36);

        arr.insert(60);
        arr.insert(5);
        arr.insert(15);
        arr.insert(45);
        arr.insert(35);
        arr.insert(20);
        arr.insert(25);
        arr.insert(10);
        arr.insert(50);
        arr.insert(30);

        System.out.println("Data Awal :");
        arr.display();

        System.out.println("\nMenampilkan Perulangan : ");
        arr.QuickSort();
        System.out.println("\nData Urut (Quick Sort) : ");
        arr.display();
    }
}
