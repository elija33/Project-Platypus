import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.awt.*;
import javax.swing.SwingUtilities;
import java.awt.Desktop;

public class MyPanel extends JPanel implements ActionListener {
    private JButton jcomp1;
    private JLabel jcomp2;
    private JList Solutions;
    private JLabel jcomp4;
    private JLabel jcomp5;
    private JList jcomp6;
    private JMenuBar jcomp7;

    public MyPanel() {
        //construct preComponents
        String[] SolutionsItems = {"Solution 1", "Solution 2", "Solution 3"};
        String[] jcomp6Items = {"ISSUES WILL BE DISPLAYED HERE"};
        JMenu fileMenu = new JMenu ("File");
        JMenuItem printItem = new JMenuItem ("Print");
        fileMenu.add (printItem);
        JMenuItem exitItem = new JMenuItem ("Exit");
        fileMenu.add (exitItem);
        JMenu helpMenu = new JMenu ("Help");
        JMenuItem contentsItem = new JMenuItem ("Contents");
        helpMenu.add (contentsItem);
        JMenuItem aboutItem = new JMenuItem ("About");
        helpMenu.add (aboutItem);

        //construct components
        jcomp1 = new JButton ("SCAN FILE");
        jcomp2 = new JLabel (" Click scan to scan your csv file for any issues. The results will be displayed in the scrollbox to the right, with possible solutions for your system's issues. ");
        Solutions = new JList (SolutionsItems);
        jcomp4 = new JLabel (" Welcome to P.L.A.T.Y.P.U.S.");
        jcomp5 = new JLabel ("These are the potential problems we found with your system:");
        jcomp6 = new JList (jcomp6Items);
        jcomp7 = new JMenuBar();
        jcomp7.add (fileMenu);
        jcomp7.add (helpMenu);

        jcomp1.addActionListener(this);

        //adjust size and set layout
        setPreferredSize (new Dimension (1000, 681));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (Solutions);
        add (jcomp4);
        add (jcomp5);
        add (jcomp6);
        add (jcomp7);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (15, 490, 480, 140);
        jcomp2.setBounds (15, 580, 910, 135);
        Solutions.setBounds (505, 30, 413, 600);
        jcomp4.setBounds (15, 20, 170, 65);
        jcomp5.setBounds (15, 85, 445, 25);
        jcomp6.setBounds (15, 110, 440, 375);
        jcomp7.setBounds (0, 0, 200, 25);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jcomp1)
        {
            FileChooser.main(null);
        }
    }

    public static void main (String[] args) {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new MyPanel());
        frame.pack();
        frame.setVisible (true);
    }
}