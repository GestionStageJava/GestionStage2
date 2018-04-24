package com.btssio.models.dto;

public class DTOStage {

	//Private Arguments
	private Integer id;
	private String libelle;
	private Integer nbPlace;
	
	//Getter
	public Integer getId() {
		return this.id;
	}
	
	public String getLibelle() {
		return this.libelle;
	}
	
	public Integer getNbPlace() {
		return this.nbPlace;
	}

	//Setter
	public void setId(Integer id) {
		this.id = id;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public void setNbPlace(Integer nbPlace) {
		this.nbPlace = nbPlace;
	}
	
	
	
}
