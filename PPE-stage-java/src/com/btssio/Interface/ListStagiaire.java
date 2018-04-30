package com.btssio.Interface;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ListStagiaire extends JPanel{
	
    Object[][] data = {
    	      {"Cysboy", "28 ans", "1.80 m"},
    	      {"BZHHydde", "28 ans", "1.80 m"},
    	      {"IamBow", "24 ans", "1.90 m"},
    	      {"FunMan", "32 ans", "1.85 m"}
    	    };
    
    String  title[] = {"Pseudo", "Age", "Taille"};
    
	private JTable t1 = new JTable(data,title);
	
	public ListStagiaire() {
		
	    this.add(new JScrollPane(t1));
		
	}
}
