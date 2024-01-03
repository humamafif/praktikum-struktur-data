package Praktikum.PrakModul3.prak1;

import java.util.Scanner;

public class PembalikApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukan kata yang mau dibalik : ");
        String input = in.nextLine();
        int maxSize = input.length();

        Pembalik pembalik = new Pembalik(maxSize);
        String output = pembalik.balikKata(input);

        System.out.println("Input : " + input);
        System.out.println("Output : " + output);
    }
}
