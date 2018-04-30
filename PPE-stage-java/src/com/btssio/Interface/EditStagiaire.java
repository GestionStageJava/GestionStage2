package com.btssio.Interface;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EditStagiaire extends JPanel{
	
	private JTextField jt1 = new JTextField(10);
	private JLabel jl1 = new JLabel("Nom");
	private JTextField jt2 = new JTextField("Prenom");
	private JLabel jl2 = new JLabel("Prenom");
	private JTextField jt3 = new JTextField("Addresse");
	private JLabel jl3 = new JLabel("Addresse");
	private JTextField jt4 = new JTextField("Lieu du Stage");
	private JLabel jl4 = new JLabel("Lieu Stage");
	private JTextField jt5 = new JTextField("Date du Satge");
	private JLabel jl5 = new JLabel("Date du Stage");
	
	private JButton valid = new JButton("Valider");
	private JButton cancel = new JButton("Annuler");
	
	public EditStagiaire() {
		
		JPanel main = new JPanel();
		JPanel grid = new JPanel();
		JPanel buton = new JPanel();
		
		main.setLayout(new BorderLayout());
		grid.setLayout(new GridLayout(5,1));
		
		grid.add(jl1);
		grid.add(jt1);
		grid.add(jl2);
		grid.add(jt2);
		grid.add(jl3);
		grid.add(jt3);
		grid.add(jl4);
		grid.add(jt4);
		grid.add(jl5);
		grid.add(jt5);
		
//		this.add(jt1);
//		this.add(jt2);
//		this.add(jt3);
//		this.add(jt4);
//		this.add(jt5);
		//Creer plein de panell
		
		main.add(grid,BorderLayout.CENTER);
		main.add(buton,BorderLayout.SOUTH);
		//valid.addActionListener(new ClicValiderEditEleve(this));
		//annuler...
		
//		this.add(valid);
//		this.add(cancel);
	}

}
