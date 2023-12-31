import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordGeneratorGui extends JFrame implements ActionListener {

    JButton button;
    JButton button2;
    JButton clearOptionButton;
    JLabel label;
    JLabel label2;
    JRadioButton withoutUpperCaseButton;
    JRadioButton withoutLowerCaseButton;
    JRadioButton withoutNumbersButton;
    JRadioButton withoutSpecialCharactersButton;
    ButtonGroup buttonGroup;

    PasswordGeneratorGui() {

        Border border = BorderFactory.createLineBorder(Color.green, 4);
        Border border2 = BorderFactory.createLineBorder(Color.RED, 4);


        button = new JButton();
        button.setBounds(100, 200, 200, 100);
        button.setFocusable(false);
        button.addActionListener(this);
        button.setText("New password");

        button2 = new JButton();
        button2.setBounds(100, 450, 250, 25);
        button2.setFocusable(false);
        button2.addActionListener(this);
        button2.setText("Copy to clipboard");

        clearOptionButton = new JButton();
        clearOptionButton.setBounds(500, 600, 240, 25);
        clearOptionButton.setFocusable(false);
        clearOptionButton.addActionListener(this);
        clearOptionButton.setText("Clear the option");

        label = new JLabel();
        label.setText("Press to generate your password");
        label.setForeground(Color.white);
        label.setBorder(border);
        label.setBounds(100, 175, 200, 25);

        label2 = new JLabel();
        label2.setText("Here will appear your generated password");
        label2.setForeground(Color.white);
        label2.setBorder(border2);
        label2.setBounds(90, 400, 250, 25);

        withoutUpperCaseButton = new JRadioButton();
        withoutUpperCaseButton.setBounds(500, 400, 240, 25);
        withoutUpperCaseButton.setText("Password without upper Case letters");
        withoutUpperCaseButton.addActionListener(this);

        withoutLowerCaseButton = new JRadioButton();
        withoutLowerCaseButton.setBounds(500, 500, 240, 25);
        withoutLowerCaseButton.setText("Password without lower Case letters");
        withoutLowerCaseButton.addActionListener(this);

        withoutNumbersButton = new JRadioButton();
        withoutNumbersButton.setBounds(500, 300, 240, 25);
        withoutNumbersButton.setText("Password without numbers");
        withoutNumbersButton.addActionListener(this);

        withoutSpecialCharactersButton = new JRadioButton();
        withoutSpecialCharactersButton.setBounds(500, 200, 240, 25);
        withoutSpecialCharactersButton.setText("Password without special characters");
        withoutSpecialCharactersButton.addActionListener(this);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(withoutUpperCaseButton);
        buttonGroup.add(withoutLowerCaseButton);
        buttonGroup.add(withoutNumbersButton);
        buttonGroup.add(withoutSpecialCharactersButton);

        this.setVisible(true);
        this.setTitle("Password Generator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1000, 1000);
        this.getContentPane().setBackground(Color.black);
        this.add(label);
        this.add(button);
        this.add(label2);
        this.add(button2);
        this.add(withoutUpperCaseButton);
        this.add(withoutLowerCaseButton);
        this.add(withoutNumbersButton);
        this.add(withoutSpecialCharactersButton);
        this.add(clearOptionButton);

    }

    PasswordGenerator object = new PasswordGenerator();

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button2) {
            String label2Text = label2.getText();
            StringSelection stringSelection = new StringSelection(label2Text);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);

        }

        if (e.getSource() == button) {
            label2.setText(object.generatePassword());

        }
        if (withoutUpperCaseButton.isSelected()) {
            if (e.getSource() == button) {
                label2.setText(object.generatePasswordWithoutUpperCase());
            }
        }
        if (withoutLowerCaseButton.isSelected()) {
            if (e.getSource() == button) {
                label2.setText(object.generatePasswordWithoutLowerCase());
            }
        }
        if (withoutNumbersButton.isSelected()) {
            if (e.getSource() == button) {
                label2.setText(object.generatePasswordWithoutNumbers());
            }
        }
        if (withoutSpecialCharactersButton.isSelected()) {
            if (e.getSource() == button) {
                label2.setText(object.generatePasswordWithoutSpecialCharacters());
            }
        }
        if (e.getSource() == clearOptionButton) {
            buttonGroup.clearSelection();
        }

    }
}