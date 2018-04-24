package com.btssio.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import com.btssio.Interface.MenuBa;

public class Cmenu implements ActionListener{

	MenuBa menuBar;
	
	public Cmenu(MenuBa menuBar){
		super();
		this.menuBar = menuBar;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JMenuItem menuItem = (JMenuItem) arg0.getSource();
        System.out.println(menuItem.getText());
	}
}
