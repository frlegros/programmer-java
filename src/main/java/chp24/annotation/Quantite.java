package chp24.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by frlegros on 20/03/17.
 */
@Target(ElementType.CONSTRUCTOR)
public @interface Quantite {

    enum Etat {A_JOUR, A_ACTUALISER, PERIME};

    Etat etat() default Etat.A_JOUR;

    int value() default 0;
}
