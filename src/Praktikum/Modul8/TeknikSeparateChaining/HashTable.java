package Praktikum.Modul8.TeknikSeparateChaining;

public class HashTable {
    private SortedLinkList[] hashArray;
    private int size;

    public HashTable(int size){
        this.size = size;
        hashArray = new SortedLinkList[size];
        for (int i = 0; i < size; i++) {
            hashArray[i] = new SortedLinkList();
        }
    }

    public void displayTable(){
        System.out.println("Table: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + i + ". ");
            hashArray[i].displayList();
        }
    }

    public int hashFunc(int key){
        return key % size;
    }

    public void insert(int data){
        Link theLink = new Link(data);
        int key = theLink.getKey();
        int hashVal = hashFunc(key);
        hashArray[hashVal].insert(theLink);
    }

    public void delete(int key){
        int hashVal = hashFunc(key);
        hashArray[hashVal].delete(key);
    }

    public Link find (int key){
        int hashVal = hashFunc(key);
        Link theLink = hashArray[hashVal].find(key);
        return theLink;
    }
}
