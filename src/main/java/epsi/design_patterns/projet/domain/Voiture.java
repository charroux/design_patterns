package epsi.design_patterns.projet.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Voiture {
	
	Collection<Passager> passagers = new ArrayList<Passager>();
	Date miseEnCirculation;
	
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
	
	public Date getMiseEnService() {
		return miseEnCirculation;
	}

	public void setMiseEnService(Date miseEnService) {
		this.miseEnCirculation = miseEnService;
	}

	@Override
	public String toString() {
		return "Voiture [passagers=" + passagers + ", miseEnService=" + miseEnCirculation + "]";
	}

	

}
