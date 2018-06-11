package epsi.design_patterns.projet.application;

import epsi.design_patterns.projet.domain.Passager;
import epsi.design_patterns.projet.domain.Voiture;
import epsi.design_patterns.projet.services.persistence.Repository;

public class ConduireTaxi implements Conduire{

	Voiture taxi = new Voiture();
	Repository<Passager> repository;
	
	@Override
	public Passager addPassager(String nomPassager) {
		// rechercher passager existant
		Passager passager = repository.findByNom(nomPassager);
		// le passage n'existe pas
		if(passager == null) {
			passager = new Passager();
			repository.save(passager);
		}
		passager.setNom(nomPassager);
		taxi.addPassager(passager);	
		return passager;
	}

	@Override
	public float calculerMontantCourse(int distance) {
		return 50 * distance;
	}

	@Override
	public boolean payer(Passager payer, float montant) {
		return false;
	}

}
