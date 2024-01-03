package Praktikum.PrakModul1;

public class HighArray {
    private int[] arr;
    private int nElemen = 0;

    public HighArray(int max){
        arr = new int[max];
        nElemen = 0;
//        max = nElemen;
    }

//  Method untuk nge swap, yang nanti akan di panggil di method insert yang menggunakan buble short
    public void swap(int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
//  Insert menggunakan buble short
    public void insert(int value){
        arr[nElemen] = value;
        nElemen++;
        int limit,  i;
        for (limit = nElemen-1; limit > 0; limit--) {
            for (i = 0; i < limit; i++) {
                if (arr[i] > arr[i + 1]){
                    swap(i, i+1);
                }
            }
        }
    }

//    Menggunkan insert biasa => Output yang dihasilkan juga otomatis terurut
    public void insert1(int value){
        int i;
//        untuk menambahkan ke kanan
        for (i = 0; i < nElemen; i++) {
            if (arr[i] > value){
                break;
            }
        }
//        menambah ke kiri
        for (int j = nElemen; j > i; j--) {
            arr[j] = arr[j-1];
        }
        arr[i] = value;
        nElemen++;

    }
//    Menggunakan linear search
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
//  menggunakan binari search
    public int binarySearch(int key){
        int lower = 0;
        int upper = nElemen - 1;
        int curIn;

        while (true){
            curIn = (lower + upper) / 2;
            if (arr[curIn] == key){
                return curIn;
            } else if (lower > upper){
                return nElemen;
            } else {
                if (arr[curIn] < key){
                    lower = curIn + 1;
                } else {
                    upper = curIn - 1;
                }
            }
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

    public void display(){
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int size(){
        return nElemen;
    }
}
