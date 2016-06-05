package com.esprit.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Categorie implements Serializable {
	
	private int id;
	private String libelle;
	private String description;
	private List<SousCategorie> soucategories;
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	@OneToMany(mappedBy="categories")
	public List<SousCategorie> getSoucategories() {
		return soucategories;
	}
	public void setSoucategories(List<SousCategorie> soucategories) {
		this.soucategories = soucategories;
	}
	
	


	
	

}
