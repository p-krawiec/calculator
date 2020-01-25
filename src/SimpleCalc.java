import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalc {
    private JPanel mainPanel;
    public JPanel getMainPanel() { return mainPanel; }

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
    private JLabel memoryLabel;

    long memory = 0;
    String operation = "nop"; //no operation //obecnie wykonywana operacja

    public SimpleCalc() {

        //ustawienie fonta dla textField
        textField.setFont(new Font("SansSerif", Font.BOLD, 20));
        //ustawienie fonta dla memorylabel
        memoryLabel.setFont(new Font("SansSerif", Font.BOLD, 11));

        numbersListener();
        functionListener();
    }

    public void numbersListener() {
        a1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String text;
                if(!operation.equals("nop")) { //zabezpieczenie przed nadpisywaniem wyniku operacji
                    textField.setText("");

                }
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

        CEButton.addActionListener(new ActionListener() {
                //kasuje tylko to co na wyswietlaczu
            public void actionPerformed(ActionEvent actionEvent) {
                textField.setText("0");
            }
        });

        CButton.addActionListener(new ActionListener() {
                //kasuje wyswietlacz i pamięć
            public void actionPerformed(ActionEvent actionEvent) {
                memory = 0;
                operation = "nop";
                setMemoryLabel("");
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
                if(operation.equals("nop")) {
                    if(memory == 0)
                        memory = Long.parseLong(textField.getText());
                    else
                        memory += Long.parseLong(textField.getText());
                } else {
                    doOperation();
                }
                operation = PlusButton.getText();
                setMemoryLabel("+");
                textField.setText(String.valueOf(memory));
            }
        });

        MinusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if(operation.equals("nop")) {
                    if(memory == 0)
                        memory = -Long.parseLong(textField.getText());
                    else
                        memory -= Long.parseLong(textField.getText());
                } else {
                    doOperation();
                }
                operation = MinusButton.getText();
                setMemoryLabel("-");
                textField.setText(String.valueOf(memory));
            }
        });

        TimesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if(operation.equals("nop")) {
                    if(memory == 0)
                        memory = Long.parseLong(textField.getText());
                    else
                        memory *= Long.parseLong(textField.getText());
                } else {
                    doOperation();
                }
                operation = TimesButton.getText();
                setMemoryLabel("*");
                textField.setText(String.valueOf(memory));
            }
        });

        DivideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if(operation.equals("nop")) {
                    if(memory == 0)
                        memory = Long.parseLong(textField.getText());
                    else
                        memory = memory / Long.parseLong(textField.getText());
                } else {
                    doOperation();
                }
                operation = "d"; //bo znak / wywoływał błędy
                setMemoryLabel("/");
                textField.setText(String.valueOf(memory));
            }
        });

        EqualsButtob.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String text;
                if(!operation.equals("nop")){
                    doOperation();
                    text = String.valueOf(memory);
                } else
                    text = textField.getText();

                memory = 0;
                operation = "nop";
                setMemoryLabel("");
                textField.setText(text);
            }
        });
    }

    void setMemoryLabel(String text) {
        if(memory == 0) {
            memoryLabel.setText("0");
        } else
            memoryLabel.setText(String.valueOf(memory) + " " + text);
    }

    void doOperation() {
        switch (operation) {
            case "+":
                memory += Long.parseLong(textField.getText());
                break;
            case "-":
                memory -= Long.parseLong(textField.getText());
                break;
            case "d":
                memory = memory / Long.parseLong(textField.getText());
                break;
            case "*":
                memory *= Long.parseLong(textField.getText());
                break;
        }
    }
}
