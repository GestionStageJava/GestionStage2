package com.btssio.Interface;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.btssio.controller.Cmenu;

public class MenuBa extends JMenuBar{

	//Menu
	private JMenu m1 = new JMenu("Fichier");
	private JMenu m2 = new JMenu("Eleve");
	private JMenu m3 = new JMenu("Entreprise");
	private JMenu m4 = new JMenu("Configuration");
	private Cmenu cmenu;

	//MenuItem
	private JMenuItem menuItemListEleve = new JMenuItem("Lister");
	private JMenuItem menuItemEditEleve = new JMenuItem("Editer");
	private JMenuItem menuItemCreateEleve = new JMenuItem("Creer");
	private JMenuItem menuItemListEntr = new JMenuItem("Lister");
	private JMenuItem menuItemEditEntr = new JMenuItem("Editer");
	private JMenuItem menuItemCreateEntr = new JMenuItem("Creer");
	private JMenuItem menuItemAccueil = new JMenuItem("Accueil");
	private JMenuItem menuItemQuit = new JMenuItem("Quitter");

	
	public MenuBa() {
		//Declaration du cmenu
		cmenu = new Cmenu(this);
		
		//menuItemListEleve.addActionListener(new CMenu());
		//menu.addActionListener(new ClicValiderEditEleve(this));

		//Config Menu, add menuitem and setActionCommand 
		//m1
		this.m1.add(menuItemAccueil);
		this.menuItemAccueil.setActionCommand("Accueil");
		
		this.m1.add(menuItemQuit);
		this.menuItemQuit.setActionCommand("Quitter");
			
		//m2
		this.m2.add(menuItemListEleve);
		this.menuItemListEleve.setActionCommand("Liste eleve");
		
		this.m2.add(menuItemEditEleve);
		this.menuItemEditEleve.setActionCommand("Edit eleve");
		
		this.m2.add(menuItemCreateEleve);
		this.menuItemCreateEleve.setActionCommand("Create eleve");
		
		//m3
		this.m3.add(menuItemListEntr);
		this.menuItemListEntr.setActionCommand("Liste entreprise");
		
		this.m3.add(menuItemEditEntr);
		this.menuItemEditEntr.setActionCommand("Edit entreprise");
		
		this.m3.add(menuItemCreateEntr);
		this.menuItemCreateEntr.setActionCommand("Create entreprise");
		
		//Menu add action listener
		//m1
		this.menuItemAccueil.addActionListener(cmenu);
		this.menuItemQuit.addActionListener(cmenu);
		
		//m2
		this.menuItemListEleve.addActionListener(cmenu);
		this.menuItemEditEleve.addActionListener(cmenu);
		this.menuItemCreateEleve.addActionListener(cmenu);

		//m3
		this.menuItemListEntr.addActionListener(cmenu);
		this.menuItemEditEntr.addActionListener(cmenu);
		this.menuItemCreateEntr.addActionListener(cmenu);
		this.menuItemCreateEntr.addActionListener(new Cmenu(this));
		
		//m4
		this.m4.setText("Configuration");
		this.m4.addActionListener(new Cmenu(this));

		//Ajout label au menu
		this.add(this.m1);
		this.add(this.m2);
		this.add(this.m3);
		this.add(this.m4);
	}
}
