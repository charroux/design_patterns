package epsi.design_patterns.createur.singleton;

/**
 * But : manipuler toujours la meme instance d un objet.
 * 
 * Solution : utiliser le mot clef static
 * 
 * @author benoit.charroux
 *
 */
public class SingletonFactory {

	// static rend unique en memoire
	private static Singleton singleton = new Singleton();

	// methode static
	public static Singleton getSingleton (){
		return singleton ;
	}

}
