import javax.swing.*;

public class DialogBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dialog Box");
        JOptionPane.showMessageDialog(frame, "Your name is Ambika Gaur.", "About", JOptionPane.INFORMATION_MESSAGE);
    }
}
