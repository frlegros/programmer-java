package chp24.introspection;

import utils.classe.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by frlegros on 20/03/17.
 */
public class Introsp01 {

    public static void main(String[] args) {

        Class<?> c;

        c = Point.class;
        System.out.println("c Point Class= "+c.getName());

        c = PointCol.class;
        System.out.println("c PointCol Class= "+c.getName());

        Point p = new Point(1,5);
        c = p.getClass();
        System.out.println("c p objt= "+c.getName());

        Method methodesd[] = c.getDeclaredMethods(); // p.getClass().getDeclaredMethods()
        System.out.println(" ");System.out.println("c p objt declaredMethods = ");
        for (Method methoded: methodesd){
            System.out.println(" ");System.out.println("-- Methode de nom: "+ methoded.getName()+" ");
            System.out.print("- type arguments: ");
            Class<?> typArgs[] = methoded.getParameterTypes();
            for (Class<?> typArg:typArgs){
                System.out.print(typArg.getName()+" ");
            }
        }

        Field champs[] = c.getDeclaredFields();
        System.out.println(" ");System.out.println("c p objt declaredFields = ");
        for (Field champ: champs){
            System.out.println("-- Champ de nom: "+champ.getName()+" ");
            System.out.println("Type: "+champ.getType()+" ");
            int mod = champ.getModifiers();
            if (Modifier.isPrivate(mod)) System.out.println("privé");
            if (Modifier.isStatic(mod)) System.out.println("static");
        }

        Constructor<?> constructeurs[] = c.getDeclaredConstructors();
        System.out.println(" ");System.out.println("c p objt declaredConstructors = ");
        for (Constructor<?> constructeur: constructeurs) System.out.print(constructeur.getName()+" ");

//        Couple<Point> cp = new Couple<Point>();
//        Couple<?> cj = new Couple<Point>();
//        System.out.println(" ");System.out.println("Classe Couple<Point> = "+cp.getClass().getName());
//        System.out.println("Classe Couple<?> = "+cj.getClass().getName());


    }
}
