package  epsi.design_patterns.structuraux.adaptateur;

import epsi.design_patterns.structuraux.adaptateur.Adaptee;

public class ImplantationAdaptee implements Adaptee{

	@Override
	public void specificRequest() {
		System.out.println("Je suis la methode specificRequest de ImplantationAdaptee");
	}

}
