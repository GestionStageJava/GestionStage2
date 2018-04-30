package com.btssio.models.dto;

public class DTOStagiaire {
	
	//Private Arguments
	private Integer id;
	private String nom;
	private String prenom;
	
	//Getter
	public Integer getId() {
		return this.id;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	//Setter
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
		
}
