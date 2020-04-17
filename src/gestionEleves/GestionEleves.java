package gestionEleves;

import java.util.ArrayList;

public class GestionEleves {
	
	private ArrayList<Eleve> listeEleves = new ArrayList<>();
	
	
	public int nombre() {
		return listeEleves.size();
		
	}
	
	
	public ArrayList<Eleve> getListe() {
		return listeEleves;
		
	}
	
	
	public void ajouterEleve(Eleve eleve) {
		listeEleves.add(eleve);
		
	}
	
	
	public Eleve chercher(String nom) {
		
		for (Eleve eleve : listeEleves) {
			if (eleve.getNom().equals(nom))
				return eleve;
		}
		
		return null;
		
	}
	
	
	public void lister() {
		System.out.println("Liste des élèves :");
		for (Eleve eleve : listeEleves)
			System.out.println(eleve);
		
	}

}
