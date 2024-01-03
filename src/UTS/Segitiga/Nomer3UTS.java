package UTS.Segitiga;

public class Nomer3UTS {

    public int Segitiga(int n){
        if (n == 1){
            return 1;
        } else {
            System.out.println( n + " + "+ (n-1));
            return n + Segitiga(n - 1);
        }
    }

    public static void main(String[] args) {
        Nomer3UTS app = new Nomer3UTS();
        System.out.println(">> Segitiga : ");
        System.out.println(app.Segitiga(10));

    }
}
