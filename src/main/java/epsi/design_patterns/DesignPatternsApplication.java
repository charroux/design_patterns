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
	VoitureRepository voitureRepository;
	
	@Autowired
	PassagerRepository passagerRepository;

	private static final Logger log = LoggerFactory.getLogger(DesignPatternsApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo1(VoitureRepository repository) {
		return (args) -> {
			
			Conduire c = new ConduireTaxi(voitureRepository, passagerRepository);
			c.addPassager("tintin");
			
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Date miseEnCirculation = df.parse("30/05/2018");
			
			Voiture voiture = new Voiture(miseEnCirculation, "11AA22");
			
			Passager passager = new Passager("Tintin", 50);
			voiture.addPassager(passager);
			
			repository.save(voiture);
			
			repository.findById("11AA22")
			.ifPresent(voit -> {
				log.info("Voiture found with findById(11AA22):");
				log.info("--------------------------------");
				log.info(voit.toString());
				log.info("");
			});
		};
	}
	
	

}
