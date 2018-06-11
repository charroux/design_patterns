package epsi.design_patterns.projet.domain;

public class Passager {
	
	Voiture voiture;
	String nom;
	float montantCourse;

	public Voiture getVoiture() {
		return voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getMontantCourse() {
		return montantCourse;
	}

	public void setMontantCourse(float montantCourse) {
		this.montantCourse = montantCourse;
	}

	@Override
	public String toString() {
		return "Passager [voiture=" + voiture + ", nom=" + nom + ", montantCourse=" + montantCourse + "]";
	}

}
