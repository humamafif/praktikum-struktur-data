package Praktikum.PrakModul4.Stack;

public class Stack {
    private LinkedList linkedList;

    public Stack(){
        linkedList = new LinkedList();
    }

    public void push(Record item){
        linkedList.insertFirst(item);
    }

    public Record pop(){
        if (isEmpty()){
            System.out.println("Stack Kosong");
            return null;
        }
        return linkedList.deleteFirst();
    }

    public Record peek(){
        if (isEmpty()){
            System.out.println("Stack Kosong");
            return null;
        }
        return linkedList.getFirst();
    }

    public boolean isEmpty(){
        return linkedList.isEmpty();
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack kosong.");
            return;
        }
        System.out.println("Stack (top --> bottom):");
        linkedList.displayList();
        System.out.println();
    }
}