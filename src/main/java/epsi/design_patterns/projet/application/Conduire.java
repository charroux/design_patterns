package epsi.design_patterns.projet.application;

import epsi.design_patterns.projet.domain.Passager;

public interface Conduire {
	
	public Passager addPassager(String nomPassager);
	public float calculerMontantCourse(int distance);
	public boolean payer(float montant);

}
