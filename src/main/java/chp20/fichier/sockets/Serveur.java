package chp20.fichier.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by frlegros on 02/03/17.
 */
public class Serveur {

    public static void main(String[] args) throws IOException{

        int port = 0;
        ServerSocket sersoc = new ServerSocket(port);
        System.out.println("address: "+sersoc.getLocalSocketAddress());
        System.out.println("Serveur actif sur port: "+port);

        while (true){
            Socket soc = sersoc.accept();
            InputStream flux = soc.getInputStream();
            BufferedReader entree = new BufferedReader(
                    new InputStreamReader(flux));
            String message = entree.readLine();
            System.out.println("Message reçu sur le serveur = "+message);
        }

    }
}
