package gestionEleves;
public class TestEleve {

	public static void main(String[] args) {
		// Créer un élève et lui donner un nom
		Eleve eleve = new Eleve("Eric");
		
		System.out.println(eleve.getMoyenne());
		
		// Note 1
		eleve.ajouterNote(12);
		System.out.println(eleve.getMoyenne());
		
		// Note 2
		eleve.ajouterNote(15);
		System.out.println(eleve.getMoyenne());
		
		// Note 3
		eleve.ajouterNote(15);
		System.out.println(eleve.getMoyenne());
		
		// Note 4
		eleve.ajouterNote(25);
		System.out.println(eleve.getMoyenne());
		
		// Note 5
		eleve.ajouterNote(-5);
		System.out.println(eleve.getMoyenne());
		
		System.out.println(eleve);
		

	}

}
