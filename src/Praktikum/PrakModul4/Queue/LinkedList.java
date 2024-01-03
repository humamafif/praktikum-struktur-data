package Praktikum.PrakModul4.Queue;

public class LinkedList {
    private Link first;
    public LinkedList(){
        first = null;
    }

     public boolean isEmpty(){
        return (first == null);
     }

     public void insertFirst(Mahasiswa data){
        Link newLink = new Link(data);
        newLink.next = first;
        first = newLink;
     }

     public void insertLast(Mahasiswa data){
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

     public Mahasiswa deleteFirst(){
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

     public Mahasiswa find(long nim){
        Link current = first;
        while (current != null){
            if (current.data.nim == nim){
                return current.data;
            } else {
                current = current.next;
            }
        }
        return null;
     }

     public Mahasiswa delete(long nim){
        Link current = first;
        Link previous = null;

        while (current!= null){
            if (current.data.nim == nim){
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

     public Mahasiswa getFirst(){
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