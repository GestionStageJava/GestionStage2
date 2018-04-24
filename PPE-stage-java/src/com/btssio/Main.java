package com.btssio;

import javax.swing.JPanel;

import com.btssio.Interface.Accueil;
import com.btssio.Interface.MenuFen;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JPanel accueil = new Accueil();
		
		MenuFen f1 = new MenuFen("Gestion de Stage",800,600,false,null, accueil);
		// Rend visible la fenetre
		f1.setVisible(true);
	}

}
