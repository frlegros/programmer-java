package chp24.annotation;

import java.lang.annotation.Retention;
import java.lang.reflect.Method;

/**
 * Created by frlegros on 20/03/17.
 */
@Marque
@Informations(message = "code provisioire", annee = 2007)
public class A {


    @Quantite(value=15)
    public A() {
    }

    @Marque
    public static int compteur;

    @Marque
    void g(){
        System.out.println("Test annotation");
    }

    int f(int n){
        System.out.println("Methode f() de la class A");
        return n;
    }

    public static void main(String[] args) throws NoSuchMethodException{

        if (A.class.isAnnotationPresent(Informations.class))
            System.out.println("Annotation @Informations est présente sur la classe");

        Method m1 = A.class.getDeclaredMethod("g");
        if (m1.isAnnotationPresent(Marque.class))
            System.out.println("Annotation @Marque est présente sur la méthode g");

        Method m2 = A.class.getDeclaredMethod("f", int.class);
        if (m2.isAnnotationPresent(Marque.class))
            System.out.println("Annotation @Marque est présente sur la méthode f(n)");
        else
            System.out.println("Annotation @Marque n'est pas présente sur la méthode f(n)");
    }
}
