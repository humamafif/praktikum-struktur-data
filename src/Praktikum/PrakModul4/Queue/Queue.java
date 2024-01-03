package Praktikum.PrakModul4.Queue;

public class Queue {
    private LinkedList linkedList;

    public Queue (){
        linkedList = new LinkedList();
    }

    public void insert(Mahasiswa data){
        linkedList.insertLast(data);
    }

    public Mahasiswa remove(){
        if (isEmpty()){
            System.out.println("Queue Kosong");
            return null;
        }
        return linkedList.deleteFirst();
    }

    public Mahasiswa peekFront(){
        return linkedList.getFirst();
    }

    public boolean isEmpty(){
        return linkedList.isEmpty();
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue kosong.");
            return;
        }
        System.out.println("Queue (Front --> Rear):");
        linkedList.displayList();
        System.out.println();
    }
}
