package epsi.design_patterns.reseau;

import java.net.DatagramSocket;
import java.net.SocketException;



public class SingletonServerFactory {
	
	// static rend unique en memoire
	// ouvrir port 2222
	private static DatagramSocket server;
	
	static {
		try {
			server = new DatagramSocket(2222);
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}
				
	// methode static
	public static DatagramSocket getSingleton (){
		return server ;
	}

}
