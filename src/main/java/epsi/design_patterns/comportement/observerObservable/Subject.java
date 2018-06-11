package epsi.design_patterns.comportement.observerObservable;

public interface Subject {
	
	public void attach(Observer observer);
	public void deattach(Observer observer);
	public void notify(Object object) throws Exception;
	
	
}
