package epsi.design_patterns.projet.application;

import epsi.design_patterns.projet.domain.Passager;

public class Main {

	public static void main(String[] args) {
		Conduire conduire = new ConduireTaxi();
		Passager passager = conduire.addPassager("Tintin");
		float montant = conduire.calculerMontantCourse(10);
		conduire.payer(passager, montant);
	}

}
