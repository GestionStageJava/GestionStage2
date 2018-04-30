package com.btssio.Interface;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ListEntreprise extends JPanel{
	
    Object[][] data = {
    	      {"Cysboy", "28 ans", "1.80 m"},
    	      {"BZHHydde", "28 ans", "1.80 m"},
    	      {"IamBow", "24 ans", "1.90 m"},
    	      {"FunMan", "32 ans", "1.85 m"}
    	    };
    //creer un dao d'entrprise et les mettre dans le tableau d'objet et titre
    
    String  title[] = {"Pseudo", "Age", "Taille"};
    
	private JTable t2 = new JTable(data,title);
	
	public ListEntreprise() {
		
	    this.add(new JScrollPane(t2));
		
	}
}
