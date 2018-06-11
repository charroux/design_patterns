package epsi.design_patterns.comportement.observerObservable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConcreteSubject implements Subject{

	List<Observer> observers = new LinkedList<Observer>();
	
	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void deattach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notify(Object object) throws Exception{
		for(Observer observer: observers) {
			observer.update(object);
		}
	}

}
