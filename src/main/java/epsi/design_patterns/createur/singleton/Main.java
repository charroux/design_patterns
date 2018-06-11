package epsi.design_patterns.createur.singleton;

public class Main {

	public static void main(String[] args) {

		// avec 2 lignes de code
		SingletonFactory singletonFactory = new SingletonFactory ();
		Singleton s1 = singletonFactory.getSingleton(); 

		// avec 1 ligne de code via le nom de la classe (methode static)
		Singleton s2 = SingletonFactory.getSingleton(); 

		s2.setI(1);
		int i = s2.getI();

		System.out.println(i);		

	}

}
