package Praktikum.PrakModul5;

public class Pangkat {
    public int hitungPangkat(int value, int eksponen){
        if (value == 1 || eksponen == 0){
            return 1;
        } else if (eksponen < 0){
            return -1;
        } else {
            return value * hitungPangkat(value, eksponen-1);
        }
    }

    public static void main(String[] args) {
        Pangkat app = new Pangkat();
        int value = 2;
        int eksponen = 3;
        System.out.println(value+"^"+eksponen+" = "+app.hitungPangkat(value,eksponen));

        value = 3;
        eksponen = 5;
        System.out.println(value+"^"+eksponen+" = "+app.hitungPangkat(value,eksponen));

        value = 3;
        eksponen = 16;
        System.out.println(value+"^"+eksponen+" = "+app.hitungPangkat(value,eksponen));
    }
}