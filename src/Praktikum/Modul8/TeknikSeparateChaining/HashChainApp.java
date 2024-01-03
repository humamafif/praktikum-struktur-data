package Praktikum.Modul8.TeknikSeparateChaining;

public class HashChainApp {
    public static void main(String[] args) {
        int size = 10;
        HashTable app = new HashTable(size);
        app.insert(10);
        app.insert(11);
        app.insert(12);
        app.insert(13);
        app.insert(14);
        app.insert(15);
        app.insert(16);
        app.insert(17);
        app.insert(18);
        app.insert(19);
//        app.insert(19);

        app.displayTable();
    }
}