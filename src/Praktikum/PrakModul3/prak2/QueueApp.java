package Praktikum.PrakModul3.prak2;


public class QueueApp {
    public static void main(String[] args) {
        Queue theQueue = new Queue(4);

        System.out.println(">> Beberapa mulai mengantri");
        theQueue.insert("Andi");
        theQueue.insert("Ahmad");
        theQueue.insert("Satrio");
        theQueue.insert("Afrizal");

        theQueue.insert("Sukran");
        theQueue.insert("Mahmud");

        theQueue.display();

        System.out.println("\n>> Satu persatu keluar antrian");
        theQueue.remove();
        theQueue.display();

        theQueue.remove();
        theQueue.display();

        theQueue.remove();
        theQueue.display();

        theQueue.remove();
        theQueue.display();
    }
}
