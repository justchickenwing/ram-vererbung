package gui;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JList;

import javax.swing.WindowConstants;

public class RamFrame extends javax.swing.JFrame {
 
    private JPanel contentPanel = new JPanel();
    private JPanel midXPanel = new JPanel();
    private JPanel memYPanel = new JPanel();
    private JPanel ralYPanel = new JPanel();

    private JLabel inputLabel = new JLabel();
    private JLabel memLabel = new JLabel();
    private JLabel ralLabel = new JLabel();

    private JLabel outputLabel = new JLabel();

    private String[] ralArray = { "LDA 0", "ADD 1", "HLT" };
    private String[] memArray = { "3", "4", "5"};

 
    public RamFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 300);
        
        contentPanel.setLayout( new BoxLayout(
                contentPanel, BoxLayout.Y_AXIS ) );
        midXPanel.setLayout( new BoxLayout(
        		midXPanel, BoxLayout.X_AXIS ) );
        memYPanel.setLayout( new BoxLayout(
        		memYPanel, BoxLayout.Y_AXIS ) );
        ralYPanel.setLayout( new BoxLayout(
        		ralYPanel, BoxLayout.Y_AXIS ) );
        
        inputLabel.setText ( "Input" );
        memLabel.setText( "Memory:" );
        ralLabel.setText( "RAL-Befehle:" );
        outputLabel.setText ( "Output" ) ;
        
        JList ralList = new JList(ralArray);
        JList memList = new JList(memArray);
        
        contentPanel.add (inputLabel);

        memYPanel.add(memLabel);

        memYPanel.add(memList);
        
        midXPanel.add(memYPanel);
        
        ralYPanel.add(ralLabel);
        
        ralYPanel.add(ralList);
        
        midXPanel.add(ralYPanel);
        
        contentPanel.add(midXPanel);

        contentPanel.add ( outputLabel ) ;

        this.getContentPane().add ( contentPanel ) ;

    }
}