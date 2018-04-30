package com.btssio.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import fr.sio.view.DialogueAjoutCartouche;

public class ControlBtnAnnulerEditStagiaire implements ActionListener
{
	EditStagiaire dialogEditStagiaire;
	
	public ControlBtnAnnulerEditStagiaire(EditStagiaire dialog)
	{
		this.dialogEditStagiaire = dialog;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// retour à l'affichage des eleves
		this.dialogEditEleve.dispose();
	}
}
