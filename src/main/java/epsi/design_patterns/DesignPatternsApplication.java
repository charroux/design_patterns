package epsi.design_patterns;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import epsi.design_patterns.jpaExemple.Customer;
import epsi.design_patterns.jpaExemple.CustomerRepository;
import epsi.design_patterns.projet.domain.Passager;
import epsi.design_patterns.projet.domain.Voiture;
import epsi.design_patterns.projet.domain.VoitureRepository;

@SpringBootApplication
public class DesignPatternsApplication {

	private static final Logger log = LoggerFactory.getLogger(DesignPatternsApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo1(VoitureRepository repository) {
		return (args) -> {
			
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
	
	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new Customer("Jack", "Bauer"));
			repository.save(new Customer("Chloe", "O'Brian"));
			repository.save(new Customer("Kim", "Bauer"));
			repository.save(new Customer("David", "Palmer"));
			repository.save(new Customer("Michelle", "Dessler"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Customer customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			repository.findById(1L)
				.ifPresent(customer -> {
					log.info("Customer found with findById(1L):");
					log.info("--------------------------------");
					log.info(customer.toString());
					log.info("");
				});

			// fetch customers by last name
			log.info("Customer found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			repository.findByLastName("Bauer").forEach(bauer -> {
				log.info(bauer.toString());
			});
			// for (Customer bauer : repository.findByLastName("Bauer")) {
			// 	log.info(bauer.toString());
			// }
			log.info("");
		};
	}

}
