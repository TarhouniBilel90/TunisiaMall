package com.esprit.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Boutique implements Serializable{
	
	private int id22;
	private String localisation;
	private int tel;
	private ProprietaireBoutique pb;
	private List <Produit> produit;
	private SecteurActivite secteuractivite;
	private Administrateur administrateur;
	
	private static final long serialVersionUID = 1L;

	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	
	@OneToOne(mappedBy="boutique")
	public ProprietaireBoutique getPb() {
		return pb;
	}
	public void setPb(ProprietaireBoutique pb) {
		this.pb = pb;
	}
	
	@OneToMany(mappedBy="boutique")
	public List<Produit> getProduit() {
		return produit;
	}
	public void setProduit(List<Produit> produit) {
		this.produit = produit;
	}
	
	@ManyToOne
	public SecteurActivite getSecteuractivite() {
		return secteuractivite;
	}
	public void setSecteuractivite(SecteurActivite secteuractivite) {
		this.secteuractivite = secteuractivite;
	}
	
	@ManyToOne
	public Administrateur getAdministrateur() {
		return administrateur;
	}
	public void setAdministrateur(Administrateur administrateur) {
		this.administrateur = administrateur;
	}

}
