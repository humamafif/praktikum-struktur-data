package Praktikum.Modul9.Pendahuluan;

public class Heap {
    private Node[] heapArray;
    private int maxSize;
    private int currentSize;

    public Heap(int size){
        maxSize = size;
        currentSize = 0;
        heapArray  = new Node[size];
    }

    public boolean isEmpty(){
        return currentSize == 0;
    }

    public boolean insert(int key){
        if (currentSize == maxSize){
            return false;
        }
        Node newNode = new Node(key);
        heapArray[currentSize] = newNode;
        trickleUp(currentSize++);
        return true;
    }

    public void trickleUp(int index){
        int parent = (index - 1) / 2;
        Node bottom = heapArray[index];

        while(index > 0 && heapArray[parent].getKey() < bottom.getKey()){
            heapArray[index] = heapArray[parent];
            index = parent;
            parent = (parent - 1) / 2;
        }
        heapArray[index] = bottom;
    }

    public Node remove(){
        Node root = heapArray[0];
        heapArray[0] = heapArray[--currentSize];
        trickleDown(0);
        return root;
    }

    public void trickleDown(int index){
        int largerChild;
        Node top = heapArray[index];
        while (index < currentSize / 2){
            int leftChild = 2 * index + 1;
            int rightChild = leftChild + 1;

            if (rightChild < currentSize && heapArray[leftChild].getKey() <  heapArray[rightChild].getKey()){
                largerChild = rightChild;
            } else {
                largerChild = leftChild;
            }

            if (top.getKey() >= heapArray[largerChild].getKey()){
                break;
            }

            heapArray[index] = heapArray[largerChild];
            index = largerChild;
        }
        heapArray[index] = top;
    }

    public void displayHeap(){
        System.out.println("Heap Array : ");
        for (int i = 0; i < currentSize; i++) {
            if (heapArray[i] != null){
                System.out.print(heapArray[i].getKey() + " ");
                System.out.print("("+i+"),  ");
            } else {
                System.out.println("--");
            }
        }

        System.out.println("");
        int nBlanks = 32;
        int itemsPerRow = 1;
        int column = 0;
        int j = 0;
        String dots = "..............................................";
        System.out.println(dots + dots);
        while (currentSize > 0){
            if (column == 0){
                for (int k = 0; k < nBlanks; k++) {
                    System.out.print(' ');
                }
            }
            System.out.print(heapArray[j].getKey());
            System.out.print(" (" + j + ")");
            if (++j == currentSize){
                break;
            }
            if (++column == itemsPerRow){
                nBlanks /= 2;
                itemsPerRow *= 2;
                column = 0;
                System.out.println();
            } else {
                for (int k = 0; k < nBlanks * 2 - 2; k++) {
                    System.out.print(' ');
                }
            }
        }
        System.out.println("\n" + dots + dots);
    }

    public void displayArray(){
        for (int i = 0; i < maxSize; i++) {
            System.out.print(heapArray[i].getKey() + " ");
            System.out.print("indeks ke - " + i);
            System.out.println();
        }
        System.out.println("");
    }

    public void change(int indeks, int newKey){
        if (indeks < 0 || indeks >= currentSize){
            System.out.println("Invalid indeks");
            return;
        }

        int oldKey = heapArray[indeks].getKey();
        heapArray[indeks].setKey(newKey);

        if (newKey > oldKey){
           trickleUp(indeks);
        } else {
            trickleDown(indeks);
        }
    }
}
