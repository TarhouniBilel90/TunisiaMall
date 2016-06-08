package com.esprit.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class SousCategorie implements Serializable {
	
	private int id;
	private String libelle;
	private String description;
	private List<Produit> produits;
	private Categorie categories;
	
	
	
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
	
	@OneToMany(mappedBy="souscategories")
	public List<Produit> getProduit() {
		return produits;
	}
	public void setProduit(List<Produit> produit) {
		this.produits = produit;
	}
	
	@ManyToOne
	public Categorie getCategories() {
		return categories;
	}
	public void setCategories(Categorie categories) {
		this.categories = categories;
	}
	
	
	
}