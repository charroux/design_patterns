package epsi.design_patterns.projet.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Voiture {
	
	@OneToMany(mappedBy="voiture", cascade = CascadeType.ALL)
	Collection<Passager> passagers = new ArrayList<Passager>();
	
	@Temporal(TemporalType.DATE)
	Date miseEnCirculation;
	
	@Id
	String immatriculation;
	
	public Voiture(String immatriculation, Date miseEnCirculation) {
		super();
		this.miseEnCirculation = miseEnCirculation;
		this.immatriculation = immatriculation;
	}
	
	public Voiture() {
		super();
	}

	public Collection<Passager> getPassagers() {
		return passagers;
	}

	public void setPassagers(Collection<Passager> passagers) {
		this.passagers = passagers;
	}
	
	public void addPassager(Passager passager) {
		passagers.add(passager);
		passager.setVoiture(this);
	}
	
	public void removePassager(Passager passager) {
		passagers.remove(passager);
		passager.setVoiture(null);
	}

	public Date getMiseEnCirculation() {
		return miseEnCirculation;
	}

	public void setMiseEnCirculation(Date miseEnCirculation) {
		this.miseEnCirculation = miseEnCirculation;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	@Override
	public String toString() {
		return "Voiture [passagers=" + passagers + ", miseEnCirculation=" + miseEnCirculation + ", immatriculation="
				+ immatriculation + "]";
	}

}
