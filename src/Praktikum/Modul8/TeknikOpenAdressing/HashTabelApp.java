package Praktikum.Modul8.TeknikOpenAdressing;

public class HashTabelApp {
    public static void main(String[] args) {
        int size = 15;
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

        app.displayTable();
        System.out.println("Penambahan 5 item");

        app.insert(22);
        app.insert(23);
        app.insert(24);
        app.insert(25);
        app.insert(26);

        app.displayTable();

        //mencari
//        System.out.println("Mencari data");
//        int key = 99;
//        if (app.find(key) != null){
//            System.out.println(key + " ditemukan");
//        } else {
//            System.out.println(key + " tidak ditemukan");
//        }

        System.out.println("Mencari data");
        int key = 90;
        if (app.findNew(key) != null){
            System.out.println(key + " ditemukan");
        } else {
            System.out.println(key + " tidak ditemukan");
        }

        System.out.println("Sebelum di hapus");
        app.displayTable();
        System.out.println("Setelah Di hapus");

        //hapus
        app.delete(22);
        app.displayTable();
    }
}
