package com.btssio.models.dto;

public class DTOEntreprise {
	
	//Private Argument
	private long id;
	private String nomlieu;
	
	public DTOEntreprise(long id, String nomlieu) {
		super();
		this.id = id;
		this.nomlieu = nomlieu;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomlieu() {
		return nomlieu;
	}

	public void setNomlieu(String nomlieu) {
		this.nomlieu = nomlieu;
	}
	
	
}
