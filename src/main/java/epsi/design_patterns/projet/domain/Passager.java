package epsi.design_patterns.projet.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Passager {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	@ManyToOne
	Voiture voiture;
	String nom;
	float montantCourse;

	public Passager(String nom, float montantCourse) {
		super();
		this.nom = nom;
		this.montantCourse = montantCourse;
	}

	public Passager() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Passager [id=" + id + ", nom=" + nom + ", montantCourse=" + montantCourse + "]";
	}


}
