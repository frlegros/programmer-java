package chp24.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by frlegros on 20/03/17.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Informations {

    String message() default "";
    int annee();
}
