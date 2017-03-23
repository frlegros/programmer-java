package chp28.patterns.abstrac.factory;

/**
 * Created by frlegros on 23/03/17.
 */
public class FabriqueStyleB extends FabriqueAbstraite{

    public BoutonRadio creerBoutonRadio(){
        return new BoutonRadioB();
    }

    public CaseCocher creerCaseCocher(){
        return new CaseCocherB();
    }

}
