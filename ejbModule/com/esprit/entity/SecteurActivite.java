package com.esprit.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class SecteurActivite implements Serializable{
	
	private int id;
	private String Libelle;
	private String description;
	private List<Boutique> boutique;
	
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return Libelle;
	}
	public void setLibelle(String libelle) {
		Libelle = libelle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@OneToMany
	public List<Boutique> getBoutique() {
		return boutique;
	}
	public void setBoutique(List<Boutique> boutique) {
		this.boutique = boutique;
	}

}
