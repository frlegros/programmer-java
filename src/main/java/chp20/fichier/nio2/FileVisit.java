package chp20.fichier.nio2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

import static java.nio.file.FileVisitResult.CONTINUE;

/**
 * Created by frlegros on 05/03/17.
 */
public class FileVisit {

    public static void main(String[] args) throws IOException{
        Path p = Paths.get("src/main/java/chp20/fichier/");

        AffichRepert ar = new AffichRepert();
        Files.walkFileTree(p, ar);
    }

    public static class AffichRepert extends SimpleFileVisitor<Path>{

        public FileVisitResult visitFile(Path fich, BasicFileAttributes attr){
            if(attr.isRegularFile()) System.out.println(fich.getFileName());
            return CONTINUE;
        }
    }


}
