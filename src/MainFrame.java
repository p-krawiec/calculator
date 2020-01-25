import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        super("Kalkulator");

        setSize(250,360);
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
