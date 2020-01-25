import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private SimpleCalc simpleCalc;
    private NWDCalculator nwdCalculator;

    public MainFrame() {
        super("Kalkulator");

        setSize(260,365);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setResizable(false);
        setVisible(true);
        simpleCalc = new SimpleCalc();
        nwdCalculator = new NWDCalculator();
        add(simpleCalc.getMainPanel());
        setJMenuBar(createMenuBar());
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(Color.decode("#E6E6E6"));

        JMenu fileMenu = new JMenu("Typ");
        JMenuItem simpleItem = new JMenuItem("Kalkulator prosty");
        JMenuItem advancedItem = new JMenuItem("Kalkulator naukowy");
        JMenuItem nwdItem = new JMenuItem("Kalkulator NWD");
        fileMenu.add(simpleItem);
        fileMenu.add(advancedItem);
        fileMenu.add(nwdItem);

        advancedItem.setEnabled(false);
        //nwdItem.setEnabled(false);

        menuBar.add(fileMenu);

        simpleItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                setSize(260,365);
                remove(nwdCalculator.getMainPanel());
                add(simpleCalc.getMainPanel());
            }
        });

        nwdItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                setSize(260,150);
                remove(simpleCalc.getMainPanel());
                add(nwdCalculator.getMainPanel());
            }
        });

        return menuBar;
    }
}
