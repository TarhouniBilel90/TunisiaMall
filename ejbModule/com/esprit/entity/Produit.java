package com.esprit.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Produit implements Serializable {
	
	private int id;
	private String libelle;
	private String description;
	private float prixHt;
	private int quantite;
	private float tva;
	private List<Media> media;
	private List<Commande> commandes;
	private SousCategorie souscategories;
	private Boutique boutique;
	
	
	
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
	public float getPrixHt() {
		return prixHt;
	}
	public void setPrixHt(float prixHt) {
		this.prixHt = prixHt;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public float getTva() {
		return tva;
	}
	public void setTva(float tva) {
		this.tva = tva;
	}
	
	@OneToMany(mappedBy="produit")
	public List<Media> getMedia() {
		return media;
	}
	public void setMedia(List<Media> media) {
		this.media = media;
	}
	
	@ManyToMany
	public List<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}
	
	@ManyToOne
	public SousCategorie getSouscategories() {
		return souscategories;
	}
	public void setSouscategories(SousCategorie souscategories) {
		this.souscategories = souscategories;
	}
	
	@ManyToOne
	public Boutique getBoutique() {
		return boutique;
	}
	public void setBoutique(Boutique boutique) {
		this.boutique = boutique;
	}

}
