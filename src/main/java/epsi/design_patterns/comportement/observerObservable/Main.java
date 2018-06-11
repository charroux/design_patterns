package epsi.design_patterns.comportement.observerObservable;

public class Main {

	public static void main(String[] args) {
		
		try {
		
			Subject subject = new ConcreteSubject(); 
			
			Observer observer1 = new ConcreteObserver();
			subject.attach(observer1);
			
			Observer observer2 = new ConcreteObserver();
			subject.attach(observer2);
			
			String s = "Bonjour";
			subject.notify(s);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
