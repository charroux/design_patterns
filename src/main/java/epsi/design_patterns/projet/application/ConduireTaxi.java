package epsi.design_patterns.projet.application;

import org.springframework.beans.factory.annotation.Autowired;

import epsi.design_patterns.projet.domain.Passager;
import epsi.design_patterns.projet.domain.PassagerRepository;
import epsi.design_patterns.projet.domain.Voiture;
import epsi.design_patterns.projet.domain.VoitureRepository;

public class ConduireTaxi implements Conduire{

	@Autowired
	VoitureRepository voitureRepository;
	@Autowired
	PassagerRepository passagerRepository;
	
	Voiture taxi = new Voiture();
	
	@Override
	public Passager addPassager(String nomPassager) {
		
		System.out.println(voitureRepository);
		
		// rechercher passager existant
		Passager passager = passagerRepository.findByNom(nomPassager);
		// le passage n'existe pas
		if(passager == null) {
			passager = new Passager();
			passagerRepository.save(passager);
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
