package Praktikum.Modul8.TeknikSeparateChaining;

public class SortedLinkList {
    private Link first;
    public SortedLinkList(){
        first = null;
    }

    public void insert(Link theLink){
        int key = theLink.getKey();
        Link prev = null;
        Link current = first;
        while (current != null && key > current.getKey()){
            prev = current;
            current = current.next;
        }
        if (prev == null){
            first = theLink;
        } else {
            prev.next = theLink;
        }
        theLink.next = current;
    }

    public void delete(int key){
        Link prev = null;
        Link current = first;
        while (current != null && key != current.getKey()){
            prev = current;
            current = current.next;
        }
        if (prev == null){
            first = first.next;
        } else {
            prev.next = current.next;
        }
    }

    public Link find(int key){
        Link current = first;
        while (current != null && current.getKey() <= key){
            if (current.getKey() == key){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void displayList(){
        System.out.print("List (first >> last): ");
        Link current = first;
        while (current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
