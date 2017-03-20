package chp23.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by frlegros on 20/03/17.
 */
public class SourceStream {

    public static void main(String[] args) {

        Integer tabObj[]={3,8,2,-4,0,12,8,-5,3,-4,15};
        List<Integer> liste = Arrays.asList(tabObj);

        System.out.println("-- Filtrage des >0 avec une collection: ");
        liste.stream().filter(ee->ee>0).forEach(ee-> System.out.print(ee+" " ));

        System.out.println("");System.out.println("-- Filtrage des >0 avec une collection, en parallèle: ");
        liste.parallelStream().filter(ee->ee>0).forEach(ee-> System.out.print(ee+" " ));

        System.out.println("");System.out.println("-- Idem en parallèle avec forEachOrdered: ");
        liste.parallelStream().filter(ee->ee>0).forEachOrdered(ee-> System.out.print(ee+" " ));

        System.out.println("");System.out.println("-- Filtrage des pairs avec une liste de valeurs: ");
        Stream.of(1,8,-3,5,-11,3,7,12,5).filter(ee->2*(ee/2)==ee).forEach(ee-> System.out.print(ee+" " ));

        System.out.println("");System.out.println("-- Filtrage des >0 avec un tableau: ");
        Stream.of(tabObj).filter(ee->ee>0).forEach(ee-> System.out.print(ee+" " ));

        System.out.println("");System.out.println("-- Avec generation valeurs aleatoires entieres entre 0 et 9: ");
        Stream.generate(Math::random).limit(8).map(ee->(int)(ee*10)).forEach(ee-> System.out.print(ee+" " ));

        System.out.println("");System.out.println("-- Avec methode iterative: ");
        Stream.iterate(15,(ee->2*ee)).limit(10).forEach(ee-> System.out.print(ee+" " ));

        System.out.println("");System.out.println("-- Carré des negatifs, double des positifs: ");
        Stream.of(tabObj).map(e->{if (e>0)return 2*e;else return e*e;}).forEach(e-> System.out.print(e+" "));

        System.out.println("");System.out.println("-- Valeurs et nombre de negatifs: ");
        Stream.of(tabObj).filter(e->e<0).peek(e-> System.out.print(e+" ")).count();

        System.out.println("");System.out.println("-- Valeurs triees ordre naturel: ");
        Stream.of(tabObj).sorted().forEach(ee-> System.out.print(ee+" " ));


        int tab[]={2,15,-3,2,-5,34,23,4,-8,12};

        OptionalInt max = IntStream.of(tab).max();
        System.out.println("");
        if (max.isPresent()) System.out.println("Max de tabObj, avec isPresent= "+max.getAsInt());

        int somme = IntStream.of(tab).filter(e->e>0).sum();
        System.out.println("");System.out.println("-- Somme des positifs de tab: "+somme);

        OptionalDouble moyenne = IntStream.of(tab).filter(e->e<0).average();
        System.out.println("");
        if (moyenne.isPresent()) System.out.println("Moyenne des <0 de tab, avec isPresent= "+moyenne.getAsDouble());

    }
}
