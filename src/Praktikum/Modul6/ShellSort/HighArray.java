package Praktikum.Modul6.ShellSort;

public class HighArray {
    private int[] arr;
    private int nElemen;

    public HighArray(int max){
        arr = new int[max];
        nElemen = 0;
    }

    public void insert(int value){
        arr[nElemen] = value;
        nElemen++;
    }

    public boolean find(int key){
        int i;
        for (i = 0; i < nElemen; i++) {
            if (arr[i] == key){
                break;
            }
        }
        if (i == nElemen){
            return false;
        } else {
            return true;
        }
    }

    public boolean delete(int value){
        int i;
        for ( i = 0; i < nElemen; i++) {
            if (value == arr[i]){
                break;
            }
        }
        if (i == nElemen){
            return false;
        } else {
            for (int j = i; j < nElemen; j++) {
                arr[j] = arr[j + 1];
            }
            nElemen--;
            return true;
        }
    }

    // metode N/2
    public void ShellSort (){
        int in, out, temp;
        int h = nElemen / 2;

        while (h > 0){
            for (out = h; out < nElemen; out++){
                temp = arr[out];
                in = out;

                while (in > h - 1 && arr[in - h] >= temp){
                    arr[in] = arr[in -h];
                    in -= h;
                }
                arr[in] = temp;
                display();
                System.out.print(" #");
            }
            h /= 2;
        }
    }

    //metode knuth
    public void ShellSortKnuth (){
        int in, out, temp;
        //penambahan
        int h = 1;

        while (h <= nElemen / 3) {
            h = 3 * h + 1;
        }

        while (h > 0){
            for (out = h; out < nElemen; out++){
                temp = arr[out];
                in = out;

                while (in > h - 1 && arr[in - h] >= temp){
                    arr[in] = arr[in -h];
                    in -= h;
                }
                arr[in] = temp;
                display();
            }
            h /= 2;
        }
    }

    public void display(){
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public int size(){
        return nElemen;
    }
}