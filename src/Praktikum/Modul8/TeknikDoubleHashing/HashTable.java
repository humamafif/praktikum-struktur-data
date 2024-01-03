package Praktikum.Modul8.TeknikDoubleHashing;

public class HashTable {
    private Data[] hashArray;
    private int size;

    public HashTable(int size){
        this.size = size;
        hashArray = new Data[size];
    }

    public void displayTable(){
        System.out.println("Table: ");
        for (int j = 0; j < size; j++) {
            if (hashArray[j] != null){
                System.out.println(" | " + j + "\t | "
                        + hashArray[j].getKey() + " | ");
            } else {
                System.out.println(" | " + j + "\t | -- |");
            }
        }
        System.out.println("");
    }

    //double hashing
    public int hashFunc1(int key){
        return key % size;
    }
    public int hashFunc2(int key){
        int bilanganPrima = 3;
        return bilanganPrima - (key % bilanganPrima);
    }

    public void insert(int data){
        Data item = new Data(data);
        int key = item.getKey();
        int hashVal1 = hashFunc1(key);
        int hashVal2 = hashFunc2(key);
        while (hashArray[hashVal1] != null){
            hashVal1 += hashVal2;
            hashVal1 %= size;
        }
        hashArray[hashVal1] = item;
    }

    public Data delete(int key){
        int hashVal = hashFunc1(key);
        while (hashArray[hashVal] != null){
            if (hashArray[hashVal].getKey() == key){
                Data temp = hashArray[hashVal];
                hashArray[hashVal] = null;
                return temp;
            }
            ++hashVal;
            hashVal %= size;
        }
        return null;
    }

    public Data find (int key) {
        int hashVal = hashFunc1(key);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                return hashArray[hashVal];
            }
            ++hashVal;
            hashVal %= size;
        }
        return null;
    }
}
