package chp09.enums;

/**
 * Created by frlegros on 24/02/17.
 */
enum EJour {

    lundi("lu"), mardi("ma"), mercredi("me"), jeudi("je"), vendredi("ve"), samedi("sa"), dimanche("di");

    private String abrege;

    private EJour(String a) {
        System.out.println("construct["+this+"("+a+")]");
        this.abrege=a;
    }

    public String abreviation(){
        return abrege;
    }
}
