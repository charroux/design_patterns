package epsi.design_patterns.projet.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		try {

			Voiture ferrari = new Voiture();
			
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Date miseEnCirculation = df.parse("30/05/2018");
			ferrari.setMiseEnCirculation(miseEnCirculation);
			
			Passager tintin = new Passager();
			tintin.setNom("Tintin");
			ferrari.addPassager(tintin);
			
			Passager haddock = new Passager();
			haddock.setNom("Haddock");
			ferrari.addPassager(haddock);
			
			System.out.println(ferrari);
			
			ferrari.removePassager(tintin);
			
			System.out.println(ferrari);

		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
