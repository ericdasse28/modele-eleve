import java.util.ArrayList;

public class Eleve {
	private String nom;
	private ArrayList<Integer> listeNotes = new ArrayList<>();
	private double moyenne = 0;
	
	
	public Eleve(String nom) {
		this.setNom(nom);
		
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public ArrayList<Integer> getListeNotes() {
		return listeNotes;
	}


	public void setListeNotes(ArrayList<Integer> listeNotes) {
		this.listeNotes = listeNotes;
	}


	public double getMoyenne() {
		return moyenne;
	}

	
	public void ajouterNote(int note) {		
		if (note < 0)
			note = 0;
		else if (note > 20)
			note = 20;
		
		listeNotes.add(note);
		
		moyenne += note / listeNotes.size();
		
	}
	
	public String toString() {
		return nom + "(" + moyenne + ")";
	}

}
