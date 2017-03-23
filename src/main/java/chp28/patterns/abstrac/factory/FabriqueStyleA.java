package chp28.patterns.abstrac.factory;

/**
 * Created by frlegros on 23/03/17.
 */
public class FabriqueStyleA extends FabriqueAbstraite{

    public BoutonRadio creerBoutonRadio(){return new BoutonRadioA();}

    public CaseCocher creerCaseCocher(){return new CaseCocherA();}

}
