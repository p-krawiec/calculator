import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NWDCalculator extends JPanel {

    private JPanel mainPanel;
    public JPanel getMainPanel() { return mainPanel; }

    private JTextField aField;
    private JTextField bField;
    private JTextField nwdField;
    private JButton obliczButton;

    public NWDCalculator() {

        nwdField.setBorder(BorderFactory.createEmptyBorder());

        obliczButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String first = aField.getText();
                String second = bField.getText();
                try {
                    int a = Integer.parseInt(first);
                    int b = Integer.parseInt(second);
                    if(a>0 && b>0) {
                        int result = nwd(a, b);
                        nwdField.setText(String.valueOf(result));
                    } else {
                        nwdField.setText("BŁĄD");
                        aField.setText("");
                        bField.setText("");
                    }
                } catch (NumberFormatException n) {
                    nwdField.setText("BŁĄD");
                    aField.setText("");
                    bField.setText("");
                }
            }
        });
    }

    public int nwd (int a, int b) {
        while(a!=b) {
            if(a>b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }
}
