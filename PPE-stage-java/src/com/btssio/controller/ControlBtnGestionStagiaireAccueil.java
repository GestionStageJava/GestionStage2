package com.btssio.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlBtnGestionEleveAccueil implements ActionListener
{
	ListEleve dialogListEleve;
	
	public public ControlBtnGestionEleveAccueil(ListEleve dialog) 
	{
		// TODO Auto-generated constructor stub
		this.dialogListEleve = dialog;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		//afficher la liste des stagiaires
		//DAO Eleve
		dialog = new ListEleves();
	}

}
