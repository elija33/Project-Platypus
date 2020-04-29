import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.awt.*;
import java.awt.Desktop;

public class MyPanel extends JPanel implements ActionListener {
    private JButton jcomp1;
    private JLabel jcomp2;
    String[] temp = {"hello"};
    private JList sortedSolutions = new JList (temp);
    private JLabel jcomp4;
    private JLabel jcomp5;
    private JList initialVulnList = new JList (temp);
    private JMenuBar jcomp7;
    
    
    
    public void setVulnList (ArrayList<Vulnerability> vulnList) {
    	
    	remove(this.initialVulnList);
    	ArrayList<String> names = new ArrayList<String>();
    	JScrollPane scrollPane = new JScrollPane();
    	
    	for(int i = 0; i < vulnList.size(); i++) {
    		names.add(vulnList.get(i).getName());
    	}
    	
    	this.initialVulnList = new JList (names.toArray());
    	scrollPane.setViewportView(this.initialVulnList);
    	this.initialVulnList.setLayoutOrientation(JList.VERTICAL);
    	
    	add(scrollPane);
    	scrollPane.setBounds (15, 110, 440, 375);
    	
    }
    
    public JList getVulnList() {
    	
    	return this.initialVulnList;
    }
    
    public void setSortedSolutions (ArrayList<Vulnerability> vulnList) {
    	
    	remove(this.sortedSolutions);
    	ArrayList<String> names = new ArrayList<String>();
    	JScrollPane scrollPane = new JScrollPane();
    	
    	for(int i = 0; i < vulnList.size(); i++) {
    		names.add(vulnList.get(i).getName() + "    " + vulnList.get(i).getRisk() + "    " + vulnList.get(i).getCost());
    	}
    	
    	this.sortedSolutions = new JList (names.toArray());
    	scrollPane.setViewportView(this.sortedSolutions);
    	this.sortedSolutions.setLayoutOrientation(JList.VERTICAL);
    	
    	add(scrollPane);
    	scrollPane.setBounds (505, 30, 1000, 600);
    	
    }
    
    public JList getSortedSolutions() {
    	
    	return this.sortedSolutions;
    }
    

    public MyPanel() {
        //construct preComponents
        String[] jcomp6Items = {"Solutions Displayed Here"};
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
        sortedSolutions = getSortedSolutions();
        jcomp4 = new JLabel (" Welcome to P.L.A.T.Y.P.U.S.");
        jcomp5 = new JLabel ("These are the potential problems we found with your system:");
        initialVulnList = getVulnList();
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
        add (initialVulnList);
        add (jcomp4);
        add (jcomp5);
        add (sortedSolutions);
        add (jcomp7);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (15, 490, 480, 140);
        jcomp2.setBounds (15, 580, 910, 135);
        sortedSolutions.setBounds (505, 30, 413, 600);
        jcomp4.setBounds (15, 20, 170, 65);
        jcomp5.setBounds (15, 85, 445, 25);
        initialVulnList.setBounds (15, 110, 440, 375);
        jcomp7.setBounds (0, 0, 200, 25);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jcomp1)
        {
        	SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    //Turn off metal's use of bold fonts
                    UIManager.put("swing.boldMetal", Boolean.FALSE);
                    FileChooser.createAndShowGUI();
                    }
            });
        }
    }
    

}
