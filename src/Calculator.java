import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JButton CEButton;
    private JButton CButton;
    private JButton BackspaceButton;
    private JButton DivideButton;
    private JButton PlusButton;
    private JButton EqualsButtob;

    long memory = 0;
    String operation = "nop"; //no operation //obecnie wykonywana operacja

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

    public void numbersListener() {
        a1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String text;
                if(textField.getText().equals("0"))
                    text = a1Button.getText();
                else
                    text = textField.getText() + a1Button.getText();
                textField.setText(text);
            }
        });

        a2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String text;
                if(textField.getText().equals("0"))
                    text = a2Button.getText();
                else
                    text = textField.getText() + a2Button.getText();
                textField.setText(text);
            }
        });

        a3Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String text;
                if(textField.getText().equals("0"))
                    text = a3Button.getText();
                else
                    text = textField.getText() + a3Button.getText();
                textField.setText(text);
            }
        });

        a4Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String text;
                if(textField.getText().equals("0"))
                    text = a4Button.getText();
                else
                    text = textField.getText() + a4Button.getText();
                textField.setText(text);
            }
        });

        a5Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String text;
                if(textField.getText().equals("0"))
                    text = a5Button.getText();
                else
                    text = textField.getText() + a5Button.getText();
                textField.setText(text);
            }
        });

        a6Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String text;
                if(textField.getText().equals("0"))
                    text = a6Button.getText();
                else
                    text = textField.getText() + a6Button.getText();
                textField.setText(text);
            }
        });

        a7Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String text;
                if(textField.getText().equals("0"))
                    text = a7Button.getText();
                else
                    text = textField.getText() + a7Button.getText();
                textField.setText(text);
            }
        });

        a8Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String text;
                if(textField.getText().equals("0"))
                    text = a8Button.getText();
                else
                    text = textField.getText() + a8Button.getText();
                textField.setText(text);
            }
        });

        a9Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String text;
                if(textField.getText().equals("0"))
                    text = a9Button.getText();
                else
                    text = textField.getText() + a9Button.getText();
                textField.setText(text);
            }
        });

        a0Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if(!textField.getText().equals("0")) {
                    String text = textField.getText() + "0";
                    textField.setText(text);
                }
            }
        });
    }

    private void functionListener() {
        PlusMinusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                long tmp = -Long.parseLong(textField.getText());
                textField.setText(String.valueOf(tmp));
            }
        });

        CButton.addActionListener(new ActionListener() {
                //kasuje tylko to co na wyswietlaczu
            public void actionPerformed(ActionEvent actionEvent) {
                textField.setText("0");
            }
        });

        CButton.addActionListener(new ActionListener() {
                //kasuje wyswietlacz i pamięć
            public void actionPerformed(ActionEvent actionEvent) {
                memory = 0;
                textField.setText(String.valueOf(memory));
            }
        });

        BackspaceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String text = "0";
                if(textField.getText().length() > 1)
                     text = textField.getText().substring(0, textField.getText().length()-1);
                textField.setText(text);
            }
        });

        ////////////// OPERATION BUTTONS

        PlusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if(memory == 0)
                    memory = Long.parseLong(textField.getText()); //jesli pamiec jest pusta to ustaw memory na liczbe
                else
                    memory += Long.parseLong(textField.getText()); //jesli pamiec nie jest pusta DODAJ
                operation = PlusButton.getText();
                textField.setText(String.valueOf(memory));
            }
        });
    }
}
