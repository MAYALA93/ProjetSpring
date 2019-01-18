package com.example.demo.model.role;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String libelle;
	
   protected Role() {
		
	}

	public Role(String libelle) {
	this.libelle=libelle;
	
	}
	public long getid() {
		return id;
	}

	public void setid(long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public void save(String string, int i) {
		// TODO Auto-generated method stub
		
	}
}
