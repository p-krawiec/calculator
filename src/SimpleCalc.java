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
    private JButton EqualsButton;
    private JLabel memoryLabel;

    double memory = 0; //pamięć kalkulatora
    String operation = "nop"; //no operation //obecnie wykonywana operacja
    boolean firstDigit = false; //czy jest to pierwsza cyfra zapisywana po wykonaniu operacji
    int maxLenght = 14; //maksymalna długość ciągu na ekranie
    boolean error = false;

    public SimpleCalc() {

        //ustawienie fonta dla textField
        textField.setFont(new Font("SansSerif", Font.BOLD, 26));
        //ustawienie fonta dla memorylabel
        memoryLabel.setFont(new Font("SansSerif", Font.BOLD, 11));
        textField.setBorder(BorderFactory.createEmptyBorder());

        numbersListener();
        functionListener();


    }

    public void numbersListener() {
        a1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String text;
                if(firstDigit || textField.getText().equals("ERROR")) { //zabezpieczenie przed nadpisywaniem wyniku operacji
                    textField.setText("");
                    firstDigit = false;
                }
                if(textField.getText().length() < maxLenght) {
                    if (textField.getText().equals("0"))
                        text = a1Button.getText();
                    else
                        text = textField.getText() + a1Button.getText();
                    textField.setText(text);
                }
            }
        });

        a2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String text;
                if(firstDigit || textField.getText().equals("ERROR")) { //zabezpieczenie przed nadpisywaniem wyniku operacji
                    textField.setText("");
                    firstDigit = false;
                }
                if(textField.getText().length() < maxLenght) {
                    if (textField.getText().equals("0"))
                        text = a2Button.getText();
                    else
                        text = textField.getText() + a2Button.getText();
                    textField.setText(text);
                }
            }
        });

        a3Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String text;
                if(firstDigit || textField.getText().equals("ERROR")) { //zabezpieczenie przed nadpisywaniem wyniku operacji
                    textField.setText("");
                    firstDigit = false;
                }
                if(textField.getText().length() < maxLenght) {
                    if (textField.getText().equals("0"))
                        text = a3Button.getText();
                    else
                        text = textField.getText() + a3Button.getText();
                    textField.setText(text);
                }
            }
        });

        a4Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String text;
                if(firstDigit || textField.getText().equals("ERROR")) { //zabezpieczenie przed nadpisywaniem wyniku operacji
                    textField.setText("");
                    firstDigit = false;
                }
                if(textField.getText().length() < maxLenght) {
                    if (textField.getText().equals("0"))
                        text = a4Button.getText();
                    else
                        text = textField.getText() + a4Button.getText();
                    textField.setText(text);
                }
            }
        });

        a5Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String text;
                if(firstDigit || textField.getText().equals("ERROR")) { //zabezpieczenie przed nadpisywaniem wyniku operacji
                    textField.setText("");
                    firstDigit = false;
                }
                if(textField.getText().length() < maxLenght) {
                    if (textField.getText().equals("0"))
                        text = a5Button.getText();
                    else
                        text = textField.getText() + a5Button.getText();
                    textField.setText(text);
                }
            }
        });

        a6Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String text;
                if(firstDigit || textField.getText().equals("ERROR")) { //zabezpieczenie przed nadpisywaniem wyniku operacji
                    textField.setText("");
                    firstDigit = false;
                }
                if(textField.getText().length() < maxLenght) {
                    if (textField.getText().equals("0"))
                        text = a6Button.getText();
                    else
                        text = textField.getText() + a6Button.getText();
                    textField.setText(text);
                }
            }
        });

        a7Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String text;
                if(firstDigit || textField.getText().equals("ERROR")) { //zabezpieczenie przed nadpisywaniem wyniku operacji
                    textField.setText("");
                    firstDigit = false;
                }
                if(textField.getText().length() < maxLenght) {
                    if (textField.getText().equals("0"))
                        text = a7Button.getText();
                    else
                        text = textField.getText() + a7Button.getText();
                    textField.setText(text);
                }
            }
        });

        a8Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String text;
                if(firstDigit || textField.getText().equals("ERROR")) { //zabezpieczenie przed nadpisywaniem wyniku operacji
                    textField.setText("");
                    firstDigit = false;
                }
                if(textField.getText().length() < maxLenght) {
                    if (textField.getText().equals("0"))
                        text = a8Button.getText();
                    else
                        text = textField.getText() + a8Button.getText();
                    textField.setText(text);
                }
            }
        });

        a9Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String text;
                if(firstDigit || textField.getText().equals("ERROR")) { //zabezpieczenie przed nadpisywaniem wyniku operacji
                    textField.setText("");
                    firstDigit = false;
                }
                if(textField.getText().length() < maxLenght) {
                    if (textField.getText().equals("0"))
                        text = a9Button.getText();
                    else
                        text = textField.getText() + a9Button.getText();
                    textField.setText(text);
                }
            }
        });

        a0Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if(firstDigit || textField.getText().equals("ERROR")) { //zabezpieczenie przed nadpisywaniem wyniku operacji
                    textField.setText("");
                    firstDigit = false;
                }
                if(textField.getText().length() < maxLenght) {
                    if (!textField.getText().equals("0")) {
                        String text = textField.getText() + "0";
                        textField.setText(text);
                    }
                }
            }
        });
    }

    private void functionListener() {
        PlusMinusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if (textField.getText().equals("ERROR")) {
                    memoryLabel.setText("0");
                    textField.setText("0");
                    return;
                }
                double tmp = -Double.parseDouble(textField.getText());
                displayText(tmp);
            }
        });

        CEButton.addActionListener(new ActionListener() {
                //kasuje tylko to co na wyswietlaczu
            public void actionPerformed(ActionEvent actionEvent) {
                if (textField.getText().equals("ERROR")) {
                    memoryLabel.setText("0");
                    textField.setText("0");
                    return;
                }
                textField.setText("0");
            }
        });

        CButton.addActionListener(new ActionListener() {
                //kasuje wyswietlacz i pamięć
            public void actionPerformed(ActionEvent actionEvent) {
                memory = 0;
                operation = "nop";
                setMemoryLabel("");

                firstDigit = false;
                textField.setText("0");
            }
        });

        BackspaceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if (textField.getText().equals("ERROR")) {
                    memoryLabel.setText("0");
                    textField.setText("0");
                    return;
                }
                if(!firstDigit) { //blokada przed usuwaniem kiedy jest sie tuz po operacji
                    String text = "0";
                    if (textField.getText().length() > 1)
                        text = textField.getText().substring(0, textField.getText().length() - 1);
                    textField.setText(text);
                }
            }
        });

        ////////////// OPERATION BUTTONS

        PlusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if (textField.getText().equals("ERROR")) {
                    memoryLabel.setText("0");
                    textField.setText("0");
                    return;
                }
                if(operation.equals("nop")) {
                    if (memory == 0) //jestli nie ma operacji w tle i lizczba jest pusta dodaj te liczbe do pamieci
                        memory = Double.parseDouble(textField.getText());
                    else
                        doOperation(Double.parseDouble(textField.getText()));
                } else { //jesli operation nie jest ustawione na nop
                    if(!firstDigit) //jesli jest operacja w tle i liczba została zmieniona WYKONAJ
                        doOperation(Double.parseDouble(textField.getText()));
                } //jesli jest operacja w tle i liczba nie została zmieniona nie rob nic

                operation = "add";
                setMemoryLabel("+");

                firstDigit = true;
                displayText(memory);
            }
        });

        MinusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if (textField.getText().equals("ERROR")) {
                    memoryLabel.setText("0");
                    textField.setText("0");
                    return;
                }
                if(operation.equals("nop")) {
                    if (memory == 0) //jestli nie ma operacji w tle i lizczba jest pusta dodaj te liczbe do pamieci
                        memory = Double.parseDouble(textField.getText());
                    else
                        doOperation(Double.parseDouble(textField.getText()));
                } else { //jesli operation nie jest ustawione na nop
                    if(!firstDigit) //jesli jest operacja w tle i liczba została zmieniona WYKONAJ
                        doOperation(Double.parseDouble(textField.getText()));
                } //jesli jest operacja w tle i liczba nie została zmieniona nie rob nic

                operation = "sub";
                setMemoryLabel("−");

                firstDigit = true;
                displayText(memory);
            }
        });

        TimesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if (textField.getText().equals("ERROR")) {
                    memoryLabel.setText("0");
                    textField.setText("0");
                    return;
                }
                if(operation.equals("nop")) {
                    if (memory == 0) //jestli nie ma operacji w tle i lizczba jest pusta dodaj te liczbe do pamieci
                        memory = Double.parseDouble(textField.getText());
                    else
                        doOperation(Double.parseDouble(textField.getText()));
                } else { //jesli operation nie jest ustawione na nop
                    if(!firstDigit) //jesli jest operacja w tle i liczba została zmieniona WYKONAJ
                        doOperation(Double.parseDouble(textField.getText()));
                } //jesli jest operacja w tle i liczba nie została zmieniona nie rob nic

                operation = "multi";
                setMemoryLabel("×");

                firstDigit = true;
                displayText(memory);
            }
        });

        DivideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if (textField.getText().equals("ERROR")) {
                    memoryLabel.setText("0");
                    textField.setText("0");
                    return;
                }
                if(operation.equals("nop")) {
                    if (memory == 0) //jestli nie ma operacji w tle i lizczba jest pusta dodaj te liczbe do pamieci
                        memory = Double.parseDouble(textField.getText());
                    else
                        doOperation(Double.parseDouble(textField.getText()));
                } else { //jesli operation nie jest ustawione na nop
                    if(!firstDigit) //jesli jest operacja w tle i liczba została zmieniona WYKONAJ
                        doOperation(Double.parseDouble(textField.getText()));
                } //jesli jest operacja w tle i liczba nie została zmieniona nie rob nic

                operation = "div";
                setMemoryLabel("÷");

                firstDigit = true;
                displayText(memory);
            }
        });

        EqualsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if (textField.getText().equals("ERROR")) {
                    memoryLabel.setText("0");
                    textField.setText("0");
                    return;
                }
                String tmpString = memoryLabel.getText();
                double tmpDouble = Double.parseDouble(textField.getText()); //aby ustawić ładnie memoryLabel
                long tmpLong = (long) tmpDouble;

                if(!operation.equals("nop")){ //jesli w tle BYLA operacja do wykonania
                    doOperation(Double.parseDouble(textField.getText()));
                    if(tmpLong == tmpDouble)
                        memoryLabel.setText(tmpString + " " + tmpLong + " =");
                    else
                        memoryLabel.setText(tmpString + " " + tmpDouble + " =");
                } else {
                    memory = Double.parseDouble(textField.getText());
                    if(tmpLong == tmpDouble)
                        memoryLabel.setText(tmpLong + " =");
                    else
                        memoryLabel.setText(tmpDouble + " =");
                }

                displayText(memory);

                operation = "nop";
                firstDigit = true;
                memory = 0;
            }
        });

        CommaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                if (textField.getText().equals("ERROR")) {
                    memoryLabel.setText("0");
                    textField.setText("0");
                    return;
                }
                String text = textField.getText();
                if(!text.contains("."))
                    text = textField.getText() + ".";
                textField.setText(text);
            }
        });
    }

    void setMemoryLabel(String text) {
        String tmp;
        long tmpMemory = (long) memory;
        //jeśli nie ma nic po przecinku wyswietl bez przecinka
        if(memory == tmpMemory)
            tmp = String.valueOf(tmpMemory);
        else //jesli jest cos po przecinku wyswietl z przecinkiem
            tmp = String.valueOf(memory);

        memoryLabel.setText(tmp + " " + text);
    }

    void doOperation(double input) {
        switch (operation) {
            case "add":
                memory += input;
                break;
            case "sub":
                memory -= input;
                break;
            case "div":
                if(textField.getText().equals("0")) {
                    memory = 0;
                    error = true;
                } else
                    memory = memory / input;
                break;
            case "multi":
                memory *= input;
                break;
        }
        //maxLenght = 12 liczb czyli 999 999 999 999
        long tmp = 999999999;
        tmp = (tmp * 1000000) + 999999;
        if(memory > tmp) {
            error = true;
            return;
        }
        if(memory < 0.00001) {
            memory = 0;
            return;
        }
        String tmpString = String.valueOf(memory);
        if(tmpString.length() > maxLenght) {
            String tmpStringCut = tmpString.substring(0, maxLenght);
            memory = Double.parseDouble(tmpStringCut);
        }
    }

    void displayText(double input) { //pracuję na memory
        if(error) {
            textField.setText("ERROR");
        } else {
            String tmp;
            long tmpMemory = (long) input;
            //jeśli nie ma nic po przecinku wyswietl bez przecinka
            if (input == tmpMemory)
                tmp = String.valueOf(tmpMemory);
            else //jesli jest cos po przecinku wyswietl z przecinkiem
                tmp = String.valueOf(input);

            textField.setText(tmp);
        }
        error = false;
    }
}
