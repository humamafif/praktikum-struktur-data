package Praktikum.PrakModul4.Stack;

public class LinkedList {
    private Link first;
    public LinkedList(){
        first = null;
    }

     public boolean isEmpty(){
        return (first == null);
     }

     public void insertFirst(Record data){
        Link newLink = new Link(data);
        newLink.next = first;
        first = newLink;
     }

     public void insertLast(Record data){
        Link newLink = new Link(data);
         if (isEmpty()) {
             first = newLink;
         } else {
             Link current = first;
             while (current.next != null){
                 current = current.next;
             }
             current.next = newLink;
         }
     }

     public Record deleteFirst(){
         if (isEmpty()){
             return null;
         }
         Link temp = first;
         first = first.next;
         return temp.data;
     }

    public Link deleteLast(){
        if (isEmpty()){
            return null;
        } else if (first.next == null){
            Link temp = first;
            first = first.next;
            return temp;
        } else {
            Link current = first;
            Link previous = first;
            while (current.next != null){
                previous = current;
                current = current.next;
            }
            previous.next = null;
            return current;
        }
    }

     public Record find(int id){
        Link current = first;
        while (current != null){
            if (current.data.id == id){
                return current.data;
            } else {
                current = current.next;
            }
        }
        return null;
     }

     public Record delete(int id){
        Link current = first;
        Link previous = null;

        while (current!= null){
            if (current.data.id == id){
                if (previous != null){
                    previous.next = current.next;
                } else {
                    first = current.next;
                }
                return current.data;
            }
            previous = current;
            current = current.next;
        }
         return null;
     }

     public Record getFirst(){
        if (isEmpty()){
            return null;
        }
        return first.data;
     }

     public void displayList(){
         if (isEmpty()){
             System.out.println("Linked List Kosong");
         }
         Link current = first;
         while (current != null){
             System.out.println(current.data.toString());
             current = current.next;
         }
     }
}