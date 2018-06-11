package epsi.design_patterns.reseau.udp.serveur;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ServeurUDP {

	public static void main(String[] args) {
		try {
			
			// ouvrir port 2222
			DatagramSocket server = new DatagramSocket(2222);
			
			System.out.println("port ouvert : " + server.getLocalPort());
			
			// preparation tableau pour recevoir les donnees
			byte[] buf = new byte[1024];
			DatagramPacket packetRecu = new DatagramPacket(buf, 1024);
			
			System.out.println("Attente packet");

			// attente packet d'un client
			server.receive(packetRecu);
			
			// recupere adresse du client
			InetAddress adresseClient = packetRecu.getAddress();
			
			// recupere port du client
			int portClient = packetRecu.getPort();
			
			// affiche le contenu du packet recu
			System.out.println("Packet recu : " + new String(packetRecu.getData()));
			System.out.println("Provenant du port : " + portClient);

			// preparation packet de reponse
			byte[] buf1 = {'d', 'e', 'f'};			
			DatagramPacket packetEnvoye = new DatagramPacket(buf1, buf1.length, adresseClient, portClient);
			
			// envoi reponse
			server.send(packetEnvoye);
			
			System.out.println("reponse envoyee : " + new String(buf1));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
