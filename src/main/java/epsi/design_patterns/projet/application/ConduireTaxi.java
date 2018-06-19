package epsi.design_patterns.projet.application;

import epsi.design_patterns.projet.domain.Passager;
import epsi.design_patterns.projet.domain.PassagerRepository;
import epsi.design_patterns.projet.domain.Voiture;
import epsi.design_patterns.projet.domain.VoitureRepository;

public class ConduireTaxi implements Conduire{

	VoitureRepository voitureRepository;
	PassagerRepository passagerRepository;
	
	Voiture taxi;
	
	public ConduireTaxi(Voiture taxi, VoitureRepository voitureRepository, PassagerRepository passagerRepository) {
		super();
		this.taxi = taxi;
		this.voitureRepository = voitureRepository;
		this.passagerRepository = passagerRepository;
	}

	@Override
	public Passager addPassager(String nomPassager) {
		// rechercher passager existant
		Passager passager = passagerRepository.findByNom(nomPassager);
		// le passage n'existe pas
		if(passager == null) {
			passager = new Passager();
		}
		
		passager.setNom(nomPassager);
		taxi.addPassager(passager);
		
		voitureRepository.save(taxi);
		
		return passager;
	}

	@Override
	public float calculerMontantCourse(int distance) {
		return 50 * distance;
	}

	@Override
	public boolean payer(float montant) {
		return false;
	}

}
