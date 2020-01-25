import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        super("Kalkulator");

        setSize(260,365);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setResizable(false);
        setVisible(true);
        SimpleCalc sc = new SimpleCalc();
        add(sc.getMainPanel());
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
        nwdItem.setEnabled(false);

        menuBar.add(fileMenu);

        return menuBar;
    }
}
