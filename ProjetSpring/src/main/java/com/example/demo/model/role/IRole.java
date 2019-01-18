package com.example.demo.model.role;


import org.springframework.data.jpa.repository.JpaRepository;


public interface IRole extends JpaRepository<Role, Long>{


}


//public interface IRole extends JpaRepository<Utilisateur, Long>{
	//boolean existsByLibelle(String libelle);
	//List<Role> findByLibelleIgnoreCase(String libelle);
	


