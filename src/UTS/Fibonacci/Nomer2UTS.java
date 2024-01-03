package UTS.Fibonacci;

public class Nomer2UTS {
    public static int Fibonacci(int n){
        if (n == 0 || n == 1){
            return n;
        } else {
            return (Fibonacci(n - 1) + Fibonacci(n - 2));
        }
    }

    public static void main(String[] args) {
        System.out.println(">> Fibonacci : ");
        int jumlah = 10;
        int awal = 1;
        for (int i = 0; i < jumlah; i++) {
            System.out.print(Fibonacci(awal) + " ");
            awal++;
        }
    }
}