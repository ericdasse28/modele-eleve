package gestionEleves;

import java.util.ArrayList;

public class TestGroupeEleves {

	public static void main(String[] args) {
		// Création d'un groupe d'élèves
		GroupeEleves monsters = new GroupeEleves();
		
		// Création et ajout d'élèves
		Eleve eleve1 = new Eleve("Luffy");
		monsters.ajouterEleve(eleve1);
		
		Eleve eleve2 = new Eleve("Zoro");
		monsters.ajouterEleve(eleve2);
		
		Eleve eleve3 = new Eleve("Sanji");
		monsters.ajouterEleve(eleve3);
		
		// Liste des élèves
		monsters.lister();
		
		// Recherche d'élèves
		System.out.println(monsters.chercher("Luffy"));
		System.out.println(monsters.chercher("Usopp"));
		
		// Nombre d'élèves
		System.out.println(monsters.nombre());
		
		// Acquérir et afficher la liste d'élèves intégrée
		ArrayList<Eleve> liste = monsters.getListe();
		System.out.println(liste);

	}

}
