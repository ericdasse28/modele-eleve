package gestionEleves;

import java.util.ArrayList;

public class TestGroupeEleves {

	public static void main(String[] args) {
		// Cr�ation d'un groupe d'�l�ves
		GroupeEleves monsters = new GroupeEleves();
		
		// Cr�ation et ajout d'�l�ves
		Eleve eleve1 = new Eleve("Luffy");
		monsters.ajouterEleve(eleve1);
		
		Eleve eleve2 = new Eleve("Zoro");
		monsters.ajouterEleve(eleve2);
		
		Eleve eleve3 = new Eleve("Sanji");
		monsters.ajouterEleve(eleve3);
		
		// Liste des �l�ves
		monsters.lister();
		
		// Recherche d'�l�ves
		System.out.println(monsters.chercher("Luffy"));
		System.out.println(monsters.chercher("Usopp"));
		
		// Nombre d'�l�ves
		System.out.println(monsters.nombre());
		
		// Acqu�rir et afficher la liste d'�l�ves int�gr�e
		ArrayList<Eleve> liste = monsters.getListe();
		System.out.println(liste);

	}

}
