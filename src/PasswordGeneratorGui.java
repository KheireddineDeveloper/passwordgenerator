import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordGeneratorGui extends JFrame implements ActionListener {

    JButton button;

    PasswordGeneratorGui() {

        Border border = BorderFactory.createLineBorder(Color.green, 4);

        button = new JButton();
        button.setBounds(100, 200, 200, 100);
        button.setFocusable(false);
        button.addActionListener(this);
        button.setText("New password");

        JLabel label = new JLabel();
        label.setText("Press to generate your password");
        label.setForeground(Color.white);
        label.setBorder(border);
        label.setBounds(100, 175, 200, 25);

        this.setVisible(true);
        this.setTitle("Password Generator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.getContentPane().setBackground(Color.black);
        this.add(label);
        this.add(button);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
           PasswordGenerator object = new PasswordGenerator(); // Create an object of Main
            object.generatePassword();


        }

    }
}
