package Praktikum.PrakModul1;

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray arr;
        arr = new HighArray(maxSize);

        arr.insert1(15);
        arr.insert1(30);
        arr.insert1(45);
        arr.insert1(53);
        arr.insert1(77);
        arr.insert1(79);
        arr.insert1(81);


        System.out.println("Array Awal : ");
        arr.display();
        int key = 77;
        if (arr.find(key)){
            System.out.println(key + " ditemukan");
        } else {
            System.out.println(key + " tidak ditemukan");
        }

        System.out.println("value : " + key);
        System.out.println("Berada pada index ke : " + arr.binarySearch(key));

        arr.delete(15);
        arr.delete(30);
        arr.delete(45);

        System.out.println("Array yg sudah di hapus :");
        arr.display();
        arr.insert1(66);
        arr.insert1(10);

        System.out.println("Array baru : ");
        arr.display();
        System.out.println(arr.size());
    }
}
