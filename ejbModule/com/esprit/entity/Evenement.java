package com.esprit.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Evenement implements Serializable{
	
	private Integer id;
	private Date dateDebut;
	private Date dateFin;
	private String description;
	private SuperAdmin administrateur;
	
	
	@Id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@ManyToOne
	public SuperAdmin getAdministrateur() {
		return administrateur;
	}
	public void setAdministrateur(SuperAdmin administrateur) {
		this.administrateur = administrateur;
	}
	

}
