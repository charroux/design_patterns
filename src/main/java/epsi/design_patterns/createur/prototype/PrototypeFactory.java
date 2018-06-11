package epsi.design_patterns.createur.prototype;

/**
 * But : Specifier le genre d objets a creer en utilisant un prototype d instance.
 * 
 * @author benoit.charroux
 *
 */
public class PrototypeFactory {

	public static Prototype getPrototype(Type type){
		if(type == Type.Type1){
			return new Prototype1();
		}else{
			return new Prototype2();
		}
	}

}
