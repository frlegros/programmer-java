package chp20.fichier.nio2;

import java.io.IOException;
import java.nio.*;
import java.nio.file.*;

/**
 * Created by frlegros on 05/03/17.
 */
public class FileList {

    public static void main(String[] args)  throws IOException{

        Path chemin = Paths.get("src/main/java/chp20/fichier/");

        DirectoryStream <Path> membres = Files.newDirectoryStream(chemin);

        for (Path m: membres){
            System.out.println(m.getFileName());
        }

        membres.close();
    }
}
