package com.btssio.Interface;

import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class MenuFen extends JFrame {
	
	//D�claration des variables
	private String title;
	private int height;
	private int width;
	private boolean resize;
	private Component relative;
	
	private JPanel conteneur; // Pour les tests, chnger le nom de la classinterface � afficher
	
		//Menu
	private JMenuBar menu = new MenuBa();
	
	//Constructeur de la fen�tre
	public MenuFen(String t, int h, int w, boolean res, Component rel, JPanel conteneur){
		//Affectation
		this.conteneur = conteneur;
		
		this.title = t;
		this.height = h;
		this.width = w;
		this.resize = res;
		this.relative = rel;
		
		//Definition des param�tres de la fen�tre
		setTitle(title);
		setSize(h,w);
		setResizable(res);
		setLocationRelativeTo(rel);
		
		setContentPane(conteneur);
		setJMenuBar(this.menu);
	}

	public JPanel getConteneur() {
		return conteneur;
	}

	public void setConteneur(JPanel conteneur) {
		this.conteneur = conteneur;
	}
}
