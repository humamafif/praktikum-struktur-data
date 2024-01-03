package Praktikum.Modul5;

public class Rekursi {

//    public int triangleIter(int n){
//        int result = 0;
//        for (int i = n; i > 0; i--) {
//            System.out.println("Iterasi >> " + (n - i) + " + " + i);
//            result += i;
//        }
//        return result;
//    }
//
//    public int triangleRecur(int n){
//        if (n == 1){
//            return 1;
//        } else {
//            System.out.println("Rekursif >> "+ n + " + "+ (n-1));
//            return n + triangleRecur(n - 1);
//        }
//    }

    public int faktorialFor(int n){
        int temp = 1;
        if (n == 0){
            return temp;
        } else if (n < 0){
            System.out.println(n + " Negative");
        } else {
            for (int i = 1; i <= n; i++) {
//                System.out.println("Iterasi => " + temp + " * " + i);
                temp = temp * i;
            }
        }
        return temp;
    }

    public int faktrorialRekursif(int n){
        if (n == 1){
            return n;
        } else if (n < 0){
            System.out.println(n + " : Negative");
        }
        return n * faktrorialRekursif(n - 1);
    }

    public static void main(String[] args) {
        Rekursi app = new Rekursi();
//        System.out.println(">> Triangle");
//        System.out.println("Menggunakan For Loop");
//        System.out.println(app.triangleIter(5));
//        System.out.println("Menggunakan Rekursi");
//        System.out.println(app.triangleRecur(5));

        System.out.println(">> Factorial");
        System.out.println("Menggunakan For Loop");
        System.out.println("Hasil : " +app.faktorialFor(5));
        System.out.println("Menggunakan Rekursi");
        System.out.println("Hasil : " + app.faktrorialRekursif(5));
    }
}