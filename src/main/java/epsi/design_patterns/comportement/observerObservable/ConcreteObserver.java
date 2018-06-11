package epsi.design_patterns.comportement.observerObservable;

public class ConcreteObserver implements Observer{

	@Override
	public void update(Object object) {
		System.out.println("Je suis l objet " + this + " qui recoit : " + object + " en argument.");
	}

}
