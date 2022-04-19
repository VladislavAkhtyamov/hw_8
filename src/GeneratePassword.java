import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GeneratePassword extends JFrame {

    public void popularPassword(String[] password){}
    public void saveToFile(String[] password){}
    public GeneratePassword(){
        setBounds(300,300,500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generator");
        setResizable(false);
        JButton jButton = new JButton("Generate Password");
        JTextField jTextField = new JTextField();
        jTextField.setEnabled(false);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                String[] popularPassword = {"hello","fine","ok"};
                String result = "";
                result += popularPassword[random.nextInt(3)];
                result += random.nextInt(90) + 10;
                jTextField.setText(result);

            }
        });

        add(jButton, BorderLayout.NORTH);
        add(jTextField, BorderLayout.CENTER);
        setVisible(true);


    }

    public static void main(String[] args) {
        new GeneratePassword();
    }
}
