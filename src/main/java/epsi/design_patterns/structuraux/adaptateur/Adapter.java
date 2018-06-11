package epsi.design_patterns.structuraux.adaptateur;

public class Adapter implements Target, Adaptee{

	Adaptee adaptee = new ImplantationAdaptee();
	
	@Override
	public void specificRequest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void request() {
		adaptee.specificRequest();
	}

}
