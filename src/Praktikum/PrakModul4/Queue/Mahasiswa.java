package Praktikum.PrakModul4.Queue;

public class Mahasiswa {
    String nama;
    long nim;

    Mahasiswa(long nim ,String nama){
        this.nim = nim;
        this.nama = nama;
    }

    public String toString(){
        return nim + " " + nama;
    }
}
