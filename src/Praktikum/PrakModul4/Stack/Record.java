package Praktikum.PrakModul4.Stack;

public class Record {
    String nama;
    int id;

    Record (int id, String nama){
        this.id = id;
        this.nama = nama;
    }

    @Override
    public String toString(){
        return "{ "+id+", " + nama + " }";
    }
}