package com.btssio.Interface;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Stage extends JPanel
{
	private JLabel l1 = new JLabel("Interface de gestion des stages");
	private JComboBox<String> jcStagiaire = new JComboBox<>();
	private JComboBox<String> jcEntreprise = new JComboBox<>();
	
	private JButton btnAssocierStage = new JButton("Associer");
	private JButton btnAnnulerStage = new JButton("Annuler");
	
	public Stage() 
	{
		jcStagiaire.addItem("Stagiaire1");
		jcStagiaire.addItem("Stagiaire2");
		jcStagiaire.addItem("Stagiaire3");
		
		jcEntreprise.addItem("Entreprise1");
		jcEntreprise.addItem("Entreprise2");
		jcEntreprise.addItem("Entreprise3");
	
		JPanel titre = new JPanel();
		//JPanel t = new JPanel();
		titre.setLayout(new BorderLayout());
		titre.add(l1);
		
		JPanel combos = new JPanel();
		combos.add(jcStagiaire);
		combos.add(jcEntreprise);
		
		JPanel bloc = new JPanel();
		bloc.add(combos);
		
		this.add(titre, BorderLayout.NORTH);
		this.add(bloc, BorderLayout.SOUTH);
	}
}
