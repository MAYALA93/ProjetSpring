package com.example.demo;

import java.util.HashSet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.model.role.IRole;
import com.example.demo.model.role.Role;
import com.example.demo.model.utilisateur.IUtilisateur;
import com.example.demo.model.utilisateur.Utilisateur;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjetSpringApplicationTests {

	//elle fournit une instance de classe qu'on a demandé
	@Autowired 
	IUtilisateur utilisateurs; 
	
	@Autowired
    IRole roles;
	//roles prend un s car il affichera tous les élements
	//sur la base de donnée
		
		@Test
	    public void testUtilisateur(){
			
			Role admin = new Role("administrateur");
			roles.save(admin);
			Role moderateur = new Role("moderateur");
			roles.save(moderateur);
			//La liste sapelle administrateur en chef
			HashSet<Role>administrateurEnChef=new HashSet<Role>();
			//Dans la liste administrateur en chef,on ajoute l'admin 
			//et modérateur
			administrateurEnChef.add(admin);
			administrateurEnChef.add(moderateur);
			
			Utilisateur carine = new Utilisateur(1234L, "password", true, administrateurEnChef);
	        utilisateurs.save(carine);
		}
	}
