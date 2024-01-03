package Praktikum.Modul7;

public class Node {
    public int id;
    public String data;
    public Node leftChild, rightChild;

    public void displayNode(){
        System.out.println("{ "+id + ", " + data + " } ");
    }
}
