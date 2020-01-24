import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class Calculator extends JFrame{
    private JPanel mainPanel;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JTextField textField;
    private JButton PlusMinusButton;
    private JButton a0Button;
    private JButton CommaButton;
    private JButton TimesButton;
    private JButton MinusButton;
    private JButton PercentButton;
    private JButton CEButton;
    private JButton BackspaceButton;
    private JButton DivideButton;
    private JButton PlusButton;
    private JButton EqualsButtob;

    long memory = 0;

    public Calculator() {
        super("Calculator");

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(250,320);
        setVisible(true);
        add(mainPanel);
        textField.setFont(new Font("SansSerif", Font.BOLD, 20));

        numbersListener();
        functionListener();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() { new Calculator(); } });
    }

    public void numbersListener() {
        a1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if(memory == 0)
                    memory = Integer.parseInt(a1Button.getText());
                else {
                    memory *= 10;
                    memory += Integer.parseInt(a1Button.getText());
                }
                textField.setText(String.valueOf(memory));
            }
        });

        a2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if(memory == 0)
                    memory = Integer.parseInt(a2Button.getText());
                else {
                    memory *= 10;
                    memory += Integer.parseInt(a2Button.getText());
                }
                textField.setText(String.valueOf(memory));
            }
        });

        a3Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if(memory == 0)
                    memory = Integer.parseInt(a3Button.getText());
                else {
                    memory *= 10;
                    memory += Integer.parseInt(a3Button.getText());
                }
                textField.setText(String.valueOf(memory));
            }
        });

        a4Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if(memory == 0)
                    memory = Integer.parseInt(a4Button.getText());
                else {
                    memory *= 10;
                    memory += Integer.parseInt(a4Button.getText());
                }
                textField.setText(String.valueOf(memory));
            }
        });

        a5Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if(memory == 0)
                    memory = Integer.parseInt(a5Button.getText());
                else {
                    memory *= 10;
                    memory += Integer.parseInt(a5Button.getText());
                }
                textField.setText(String.valueOf(memory));
            }
        });

        a6Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if(memory == 0)
                    memory = Integer.parseInt(a6Button.getText());
                else {
                    memory *= 10;
                    memory += Integer.parseInt(a6Button.getText());
                }
                textField.setText(String.valueOf(memory));
            }
        });

        a7Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if(memory == 0)
                    memory = Integer.parseInt(a7Button.getText());
                else {
                    memory *= 10;
                    memory += Integer.parseInt(a7Button.getText());
                }
                textField.setText(String.valueOf(memory));
            }
        });

        a8Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if(memory == 0)
                    memory = Integer.parseInt(a8Button.getText());
                else {
                    memory *= 10;
                    memory += Integer.parseInt(a8Button.getText());
                }
                textField.setText(String.valueOf(memory));
            }
        });

        a9Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if(memory == 0)
                    memory = Integer.parseInt(a9Button.getText());
                else {
                    memory *= 10;
                    memory += Integer.parseInt(a9Button.getText());
                }
                textField.setText(String.valueOf(memory));
            }
        });

        a0Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if(memory != 0)
                    memory *= 10;
                textField.setText(String.valueOf(memory));
            }
        });
    }

    private void functionListener() {
        PlusMinusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                memory = -memory;
                textField.setText(String.valueOf(memory));
            }
        });

        CEButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                memory = 0;
                textField.setText(String.valueOf(memory));
            }
        });

        BackspaceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                memory -= memory%10;
                memory /= 10;
                textField.setText(String.valueOf(memory));
            }
        });
    }
}
