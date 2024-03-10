import javax.swing.*;
import java.awt.*;

public class GridLayoutControl {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout Control");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        JButton[] buttons = new JButton[9];
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton(String.valueOf(i + 1));
            frame.add(buttons[i]);
        }
        frame.setLayout(new GridLayout(3, 3));
        frame.setVisible(true);
    }
}