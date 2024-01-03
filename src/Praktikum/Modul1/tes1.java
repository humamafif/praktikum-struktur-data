package Praktikum.Modul1;

public class tes1 {
    public static void main(String[] args) {
        String[] array = new String[10];
        array[5] = "10";
        array[1] = "w";
        array[2] = "q";
        array[3] = "a";
        array[4] = "s";
//        array[11] = "s";

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");

        array = new String[20];
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
}
