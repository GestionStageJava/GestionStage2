package com.btssio.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.btssio.Interface.MenuBa;

public class Cmenu implements ActionListener{

	MenuBa menuBar;
	
	public Cmenu(MenuBa menuBar){
		super();
		this.menuBar = menuBar;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//test1
		System.out.println("test de clic pour maxence");
	}
}
