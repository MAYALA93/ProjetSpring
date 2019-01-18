package com.example.demo.model.utilisateur;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.demo.model.role.Role;

@Entity
public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private long login;
	
	private String password;
	
	private boolean actif;
	
	
	@OneToMany
	private Set<Role> listeRoles = new HashSet<Role>();
	

	//car il ya plusieurs listes de role à gerer ajouter des 
	// élements associés à une clé primaire unique
	
protected Utilisateur() {
		
	}
	
//parametre
  public Utilisateur(long login, String password, boolean actif, HashSet<Role> listeRoles) {
	 this.login=login;
	 this.password=password;
	 this.actif=actif;
	 this.listeRoles=listeRoles;
	
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public long getLogin() {
	return login;
}

public void setLogin(long login) {
	this.login = login;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public boolean isActif() {
	return actif;
}

public void setActif(boolean actif) {
	this.actif = actif;
}

public Set<Role> getListeRoles() {
	return listeRoles;
}

public void setListeRoles(Set<Role> listeRoles) {
	this.listeRoles = listeRoles;
}
}