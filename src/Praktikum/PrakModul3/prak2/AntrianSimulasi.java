package Praktikum.PrakModul3.prak2;

import java.util.Scanner;

public class AntrianSimulasi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxSize;

        System.out.print("Masukkan ukuran maksimum antrian: ");
        maxSize = scanner.nextInt();

        String[] antrian = new String[maxSize];
        int front = 0;
        int rear = -1;
        int nItems = 0;

        while (true) {
            System.out.println("\nPilih aksi:");
            System.out.println("1. Tambah objek pada antrian");
            System.out.println("2. Tampilkan isi antrian");
            System.out.println("3. Keluarkan objek dari antrian");
            System.out.println("4. Keluar dari program");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline

            switch (pilihan) {
                case 1:
                    if (nItems < maxSize) {
                        System.out.print("Masukkan objek ke dalam antrian: ");
                        String objek = scanner.nextLine();
                        rear = (rear + 1) % maxSize;
                        antrian[rear] = objek;
                        nItems++;
                        System.out.println(objek + " telah dimasukkan ke dalam antrian.");
                    } else {
                        System.out.println("Antrian sudah penuh.");
                    }
                    break;
                case 2:
                    System.out.print("Isi antrian: ");
                    int count = 0;
                    int index = front;
                    while (count < nItems) {
                        System.out.print(antrian[index] + " ");
                        index = (index + 1) % maxSize;
                        count++;
                    }
                    System.out.println();
                    break;
                case 3:
                    if (nItems > 0) {
                        System.out.println(antrian[front] + " telah keluar dari antrian.");
                        front = (front + 1) % maxSize;
                        nItems--;
                    } else {
                        System.out.println("Antrian sudah kosong.");
                    }
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
