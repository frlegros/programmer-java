package chp20.fichier.sockets;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * Created by frlegros on 02/03/17.
 */
public class Client {

    public static void main(String[] args) throws IOException{

        String hote = "0.0.0.0";
        int port = 35470;
        Socket soc = new Socket(hote,port);
        OutputStream flux = soc.getOutputStream();
        OutputStreamWriter sortie = new OutputStreamWriter(flux);
        sortie.write("Message envoyé au serveur \n");
        sortie.flush();
    }
}
