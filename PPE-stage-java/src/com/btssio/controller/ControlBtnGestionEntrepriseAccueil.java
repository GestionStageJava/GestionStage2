package com.btssio.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlBtnGestionEntrepriseAccueil implements ActionListener 
{
	ListEntreprise dialogListEntreprise;
	
	public ControlBtnGestionEntrepriseAccueil(ListEntreprise dialog)
	{
		this.dialogListEntreprise = dialog;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		//afficher la liste des entreprises
		//DAO Entreprise
		
	}

}
