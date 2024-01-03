package Praktikum.PrakModul5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Hanoi {
    int hasil;
    public void MenaraHanoi(int value, char a, char b, char c){
        if (value == 1){
            System.out.println("Cakram " + value + " dari "+ a + " ke => " + c);
            hasil++;
            return;
        }

        MenaraHanoi(value - 1, a, c, b);
        System.out.println("Cakram " + value + " dari "+ a + " ke => " + c);

        MenaraHanoi(value - 1, b, a, c);
        hasil++;
    }

    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Masukan Jumlah Cakram : ");
            int value = Integer.parseInt(input.readLine());

            Hanoi app = new Hanoi();
            app.MenaraHanoi(value, 'A', 'B', 'C');
            System.out.println("Jumlah Rekursi : " + app.hasil);
        } catch (Exception e){
            System.err.println(e);
        }
    }
}