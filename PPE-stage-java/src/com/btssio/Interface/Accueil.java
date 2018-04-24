package com.btssio.Interface;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.btssio.controller.TestClic;

public class Accueil extends JPanel{
	
		//Composant
	private JLabel l1 = new JLabel("Bienvenue sur l'interface d'utilisation de Gestion de Stage");
	private JButton b1 = new JButton("Gestion des Elèves");
	private JButton b2 = new JButton("Gestion des Entreprises");
	//private JTextField texte = new JTextField("Entrez qlqc");
	//private JComboBox<String> combo = new JComboBox<String>();

	public Accueil() {
		//Ajout de donn�es dans combobox
		//combo.addItem("La vie");
		//combo.addItem("La mort");
		JPanel titre = new JPanel();
		JPanel bloc = new JPanel();
		JPanel bouton = new JPanel();
		JPanel t = new JPanel();
		
		titre.setLayout(new BorderLayout());
		t.add(l1);
		bouton.add(b1);
		b1.addActionListener(new TestClic(this));
		bouton.add(b2);
		
		titre.add(t);
		bloc.add(bouton);
		//Ajout des composants dans le conteneur
		this.add(titre,BorderLayout.NORTH);
		this.add(bloc,BorderLayout.SOUTH);
		//this.add(b2,BorderLayout.CENTER);
		//this.add(texte);
		//this.add(combo);
	}
}
