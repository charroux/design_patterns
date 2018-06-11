package epsi.design_patterns.reseau;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import epsi.design_patterns.comportement.observerObservable.Observer;



public class NetworkObserver implements Observer{
	
	InetAddress adresseClient;
	int portClient;

	public NetworkObserver() throws Exception {
		super();
		// attente packet d'un client
		// preparation tableau pour recevoir les donnees
		byte[] buf = new byte[1024];
		DatagramPacket packetRecu = new DatagramPacket(buf, 1024);
					
		System.out.println("Attente packet");

		// attente packet d'un client
		DatagramSocket server = SingletonServerFactory.getSingleton();
		server.receive(packetRecu);
					
		// recupere adresse du client
		this.adresseClient = packetRecu.getAddress();
				
		// recupere port du client
		this.portClient = packetRecu.getPort();
	}

	@Override
	public void update(Object object) throws Exception {
		// preparation packet de reponse
		
		if(object instanceof String) {
			String s =(String)object;
			
			byte[] buf1 = s.getBytes();			
			DatagramPacket packetEnvoye = new DatagramPacket(buf1, buf1.length, adresseClient, portClient);
						
			// envoi reponse
			DatagramSocket server = SingletonServerFactory.getSingleton();
			server.send(packetEnvoye);
						
			System.out.println("Reponse envoyee : " + new String(buf1));
		}
		
	}

}
