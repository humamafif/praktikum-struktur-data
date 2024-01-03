package Praktikum.PrakModul4.Queue;

public class QueueApp {
    public static void main(String[] args) {
        Queue app = new Queue();

        app.insert(new Mahasiswa(1665100, "Dea"));
        app.insert(new Mahasiswa(1665200, "Deaja"));
        app.display();

        app.insert(new Mahasiswa(1665300, "Ami"));
        app.insert(new Mahasiswa(1665400, "Haya"));
        app.insert(new Mahasiswa(1665500, "Yati"));
        app.display();

        app.remove();
        app.remove();
        app.display();
    }
}
