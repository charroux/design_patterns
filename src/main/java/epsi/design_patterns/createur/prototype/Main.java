package epsi.design_patterns.createur.prototype;

public class Main {

	public static void main(String[] args) {
		
		Prototype p = PrototypeFactory.getPrototype(Type.Type1);
		if(p instanceof Prototype1){
			System.out.println("ok");
			
			Prototype1 p1 = (Prototype1)p;
			
		} else {
			System.out.println("erreur");
		}	

	}

}
