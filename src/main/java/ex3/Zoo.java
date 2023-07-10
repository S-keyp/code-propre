package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private String nom;
	private List<Animal> animaux = new ArrayList<Animal>();


	public Zoo(String nom){
		this.nom = nom;
	}
	
	/**
	 * Ajoute 
	 * @param nomAnimal (String)
	 * @param typeAnimal (Type)
	 * @param comportement (Comportement)
	 */
	public void addAnimal(Animal animal){
		animaux.add(animal);
	}
	
	/**
	 * Affiche la liste des animaux du Zoo
	 */
	public void afficherListeAnimaux(){
		for (int i=0; i<animaux.size(); i++) {
			System.out.println(animaux.get(i));
		}
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
