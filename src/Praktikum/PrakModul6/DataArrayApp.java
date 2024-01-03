package Praktikum.PrakModul6;

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


        System.out.println("\n==================== Merge Sort ====================");
        System.out.println("Urut (by NIM):");
        arr.mergeSortbyNIM();
        arr.displayArray();

        System.out.println("Urut (by Nama):");

        arr.mergeSortbyNama();
        arr.displayArray();

        System.out.println("\n==================== Shell Sort Knuth ====================");
        System.out.println("Urut (by NIM):");
        arr.ShellSortKnuthbyNIM();
        arr.displayArray();

        System.out.println("Urut (by Nama):");

        arr.ShellSortKnuthbyNama();
        arr.displayArray();

        System.out.println("\n==================== Quick Sort ====================");
        System.out.println("Urut (by NIM):");
        arr.QuickSortNIM();
        arr.displayArray();

        System.out.println("Urut (by Nama):");

        arr.QuickSortNama();
        arr.displayArray();

    }
}