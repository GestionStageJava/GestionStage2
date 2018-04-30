package com.btssio.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import com.btssio.Main;
import com.btssio.Interface.Accueil;
import com.btssio.Interface.ListEntreprise;
import com.btssio.Interface.MenuFen;

public class TestClic implements ActionListener {
	
	Accueil accueil;

	public TestClic(Accueil accueil) {
		// TODO Auto-generated constructor stub
		super();
		this.accueil = accueil;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ca Clic");
		JPanel accueil = new ListEntreprise();
		
		MenuFen f1 = new MenuFen("Gestion de Stage",800,600,false,null, accueil);
		// Rend visible la fenetre
		f1.setVisible(true);
	}

}
