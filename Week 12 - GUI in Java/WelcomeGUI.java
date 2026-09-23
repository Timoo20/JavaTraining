import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class WelcomeGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ITB 9203");
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Welcome to ITB 9203");
        JButton button = new JButton("Click Me");

        button.addActionListener(e -> label.setText("You clicked the button!"));

        frame.add(label);
        frame.add(button);
        frame.setVisible(true);
    }
}
