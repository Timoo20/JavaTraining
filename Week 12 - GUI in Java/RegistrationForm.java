import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Registration");
        frame.setSize(400, 220);
        frame.setLayout(new GridLayout(4, 1));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel namePanel = new JPanel();
        namePanel.add(new JLabel("Name:"));
        JTextField nameField = new JTextField(15);
        namePanel.add(nameField);

        JPanel regNoPanel = new JPanel();
        regNoPanel.add(new JLabel("Reg No:"));
        JTextField regNoField = new JTextField(15);
        regNoPanel.add(regNoField);

        JButton submitButton = new JButton("Submit");
        JLabel resultLabel = new JLabel(" ");

        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            String regNo = regNoField.getText();
            resultLabel.setText("Registered: " + name + " (" + regNo + ")");
        });

        frame.add(namePanel);
        frame.add(regNoPanel);
        frame.add(submitButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}
