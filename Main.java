import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {
        Window f1 = new Window();
        f1.setTitle("Snake");
        f1.setSize(640, 480);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
