import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        super("Kalkulator");

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(250,340);
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
