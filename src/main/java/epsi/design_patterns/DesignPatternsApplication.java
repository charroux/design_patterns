package epsi.design_patterns;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import epsi.design_patterns.projet.application.Conduire;
import epsi.design_patterns.projet.application.ConduireTaxi;
import epsi.design_patterns.projet.domain.Passager;
import epsi.design_patterns.projet.domain.PassagerRepository;
import epsi.design_patterns.projet.domain.Voiture;
import epsi.design_patterns.projet.domain.VoitureRepository;

@SpringBootApplication
public class DesignPatternsApplication {
	
	@Autowired
	PassagerRepository passagerRepository;

	private static final Logger log = LoggerFactory.getLogger(DesignPatternsApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo1(VoitureRepository voitureRepository) {
		return (args) -> {
			
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Date miseEnCirculation = df.parse("30/05/2018");
			
			Voiture taxi = new Voiture("11AA22", miseEnCirculation);
			Conduire conduire = new ConduireTaxi(taxi, voitureRepository, passagerRepository);
			conduire.addPassager("tintin");
			
			/*			
			Voiture voiture = new Voiture("11AA22", miseEnCirculation);
			
			Passager passager = new Passager("Tintin");
			
			voiture.addPassager(passager);
			
			voitureRepository.save(voiture);
			
			voitureRepository.findById("11AA22")
			.ifPresent(voit -> {
				log.info("Voiture found with findById(11AA22):");
				log.info("--------------------------------");
				log.info(voit.toString());
				log.info("");
			});*/
		};
	}
	
	

}
