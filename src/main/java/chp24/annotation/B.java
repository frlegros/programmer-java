package chp24.annotation;

/**
 * Created by frlegros on 20/03/17.
 */
public class B extends A{

    @Override
    int f(int n){
        System.out.println("Methode f() de B");
        return n;
    }

    float f(){
        System.out.println("Methode f() de B");
        return 10.4F;
    }
}
