package chp20.fichier.nio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by frlegros on 06/03/17.
 */
public class LecFicText {

    public static void main(String[] args) throws IOException{

        Path p1 = Paths.get("src/main/files/text.dat");
//        BufferedReader entree = Files.newBufferedReader(p1);

        List<String> lignes = Files.readAllLines(p1);

        for(String ligne: lignes)
            System.out.println(ligne);


    }
}
