package UTS.BubbleShort;

public class Nomer1UTS {

    private int[] data;
    private int n;

    public Nomer1UTS(int max){
        data = new int[max];
        n = 0;
    }

    public void insert(int value){
        data[n] = value;
        n++;
    }
    public void swap(int one, int two){
        int temp = data[one];
        data[one] = data[two];
        data[two] = temp;
    }

    public void BubbleSortDesceding(){
        int batas, i;
        for (batas = n-1; batas > 0 ; batas--) {
            for (i = 0; i < batas ; i++) {
                if (data[i] < data[i +1]){
                    swap(i, i + 1);
                }
            }
        }
    }

    public void display(){
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Nomer1UTS app = new Nomer1UTS(9);
        app.insert(79);
        app.insert(81);
        app.insert(100);
        app.insert(84);
        app.insert(87);
        app.insert(11);
        app.insert(10);
        app.insert(2);
        app.insert(5);

        System.out.println("Data Awal : ");
        app.display();

        System.out.println("BubbleSort Desceding : ");
        app.BubbleSortDesceding();
        app.display();

    }
}
