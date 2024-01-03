package Praktikum.Modul4.linierSinglyLinkedList;

public class LinkedList {
    private Link first;
    public LinkedList(){
        first = null;
    }

     public boolean isEmpty(){
        return (first == null);
     }

     public void insertFirst(int data){
        Link newLink = new Link(data);
        newLink.next = first;
        first = newLink;
     }

     public void insertLast(int data){
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

     public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
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


     public Link find(int key){
        Link current = first;
        while (current.data != key){
            if (current.next == null){
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
     }

     public Link delete(int key){
        Link current = first;
        Link previous = first;
        while (current.data != key){
            if (current.next == null){
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }

        if (current == first){
            first = first.next;
        } else {
            previous.next = current.next;
        }
        return current;
     }

     public void displayList(){
         System.out.println("List (first --> last) : ");

         Link current = first;
         while (current != null){
             current.displayLink();
             current = current.next;
         }
         System.out.println("");
     }
}