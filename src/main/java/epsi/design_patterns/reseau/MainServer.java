package epsi.design_patterns.reseau;

import epsi.design_patterns.comportement.observerObservable.ConcreteSubject;
import epsi.design_patterns.comportement.observerObservable.Observer;
import epsi.design_patterns.comportement.observerObservable.Subject;

public class MainServer {

	public static void main(String[] args) {
		
		try {
			
			Subject subject = new ConcreteSubject(); 
			
			Observer observer1 = new NetworkObserver();
			subject.attach(observer1);
			
			String s = "Bonjour";
			subject.notify(s);
			
			Observer observer2 = new NetworkObserver();
			subject.attach(observer2);
			
			String s1 = "Hello";
			subject.notify(s1);
			
		} catch(Exception e) {
			e.printStackTrace();
		}

		
	}

}
