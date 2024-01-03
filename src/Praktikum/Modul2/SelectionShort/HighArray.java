package Praktikum.Modul2.SelectionShort;

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

    public void display(){
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public void swap(int one, int two){
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }

    public void selecionShort(){
        int awal, i, min;
        for (awal = 0; awal < nElemen-1; awal++) {
            min = awal;
            for (i = awal + 1; i <nElemen ; i++) {
                if (arr[i] < arr[min]){
                    min = i;
                }
            }
            swap(awal, min);
            display();
        }
    }

    public int size(){
        return nElemen;
    }
}
