package Praktikum.Modul2.SelectionShort;

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray arr;
        arr = new HighArray(maxSize);
        arr.insert(70);
        arr.insert(80);
        arr.insert(75);
        arr.insert(55);
        arr.insert(85);
        arr.insert(25);

        System.out.println("Selection Short");
        System.out.println("Data Awal :");
        arr.display();

        System.out.println("\nMenampilkan Perulangan (Asceding): ");
        arr.selecionShort();

        System.out.println("\nData Urut (Asceding) : ");
        arr.display();
    }
}
