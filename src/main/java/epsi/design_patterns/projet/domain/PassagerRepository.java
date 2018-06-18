package epsi.design_patterns.projet.domain;

import org.springframework.data.repository.CrudRepository;

public interface PassagerRepository extends CrudRepository<Passager, Long> {

	public Passager findByNom(String nom);
	
}
