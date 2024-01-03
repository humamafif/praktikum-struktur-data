package Praktikum.PrakModul2;

public class DataArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        DataArray arr;
        arr = new DataArray(maxSize);

        arr.insert(16650210, "Ahmad", "Sidoarjo");
        arr.insert(16650220, "Ismail", "Banyuwangi");
        arr.insert(16650230, "Sofi", "Semarang");
        arr.insert(16650200, "Jundi", "Malang");
        arr.insert(16650240, "Dinda", "Bandung");
        arr.insert(16650250, "Rais", "Ambon");
        arr.insert(16650270, "Agung", "Madiun");
        arr.insert(16650280, "Arina", "Malang");
        arr.insert(16650260, "Helmi", "Madura");

        System.out.println("Data Awal : ");
        arr.displayArray();


        System.out.println("\n========================= Bubbble Short =========================");
        System.out.println("Urut (by NIM):");
        arr.BubbleShortByNIM();
        arr.displayArray();

        System.out.println("Urut (by Nama):");

        arr.BubbleShortByNama();
        arr.displayArray();

        System.out.println("\n======================== Insertion Short ========================");
        System.out.println("Urut (by NIM)");
        arr.insertionShortbyNIM();
        arr.displayArray();

        System.out.println("Urut (by Nama):");
        arr.insertionShortbyNama();
        arr.displayArray();

        System.out.println("\n======================== Selection Short ========================");
        System.out.println("Urut (by NIM)");
        arr.selectionShortbyNIM();
        arr.displayArray();

        System.out.println("Urut (by Nama):");
        arr.selectionShortbyName();
        arr.displayArray();
    }
}