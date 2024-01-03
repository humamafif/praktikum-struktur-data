package Praktikum.PrakModul4.Stack;

public class StackApp {
    public static void main(String[] args) {
        Stack app = new Stack();

        app.push(new Record(1, "VCD"));
        app.push(new Record(2, "TV"));
        app.display();

        app.push(new Record(3, "Kulkas"));
        app.push(new Record(4, "PC"));
        app.push(new Record(5, "Rice Cooker"));
        app.push(new Record(6, "Dispenser"));
        app.display();

        app.pop();
        app.pop();
        app.display();
    }
}
