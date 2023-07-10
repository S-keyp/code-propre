package ex3;

import java.util.List;

enum Type {
	MAMMIFERE,
	POISSON,
	SERPENT,
}

enum Comportement {
	HERBIVORE,
	CARNIVORE,
	HOMNIVORE,
}

public class Animal {
	private String nom;
    private Type type;
	private Comportement comportement;
	
	public Animal(String nom, Type type, Comportement comportement){
		this.nom = nom;
        this.type = type;
        this.comportement = comportement;
	}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Comportement getComportement() {
        return comportement;
    }

    public void setComportement(Comportement comportement) {
        this.comportement = comportement;
    }

    public String toString(){
        return nom + " " + type + " " + comportement;
    }
}
