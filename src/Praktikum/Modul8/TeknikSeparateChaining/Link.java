package Praktikum.Modul8.TeknikSeparateChaining;

public class Link {
    private int iData;
    public Link next;

    public Link(int data){
        this.iData = data;
    }

    public int getKey(){
        return iData;
    }

    public void displayLink(){
        System.out.print(iData + " ");
    }
}