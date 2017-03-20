package chp22.collection.table.associative;

import java.util.*;

/**
 * Created by frlegros on 16/03/17.
 */
public class HashMap01 {

    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<String,String>();
        hm.put("c","10");
        hm.put("f","20");
        hm.put("k","30");
        hm.put("x","40");
        hm.put("p","50");
        hm.put("g","60");
        System.out.println("hashmap initiale: "+hm);

        String ch = hm.get("f");
        System.out.println("Valeur associée à f="+ch);
        //
        Collection<String> valeurs = hm.values();
        System.out.println("Liste des valeurs initiales="+valeurs);

        valeurs.remove("30");
        System.out.println("Liste des valeurs après remove="+valeurs);
        //
        Set<String> cles = hm.keySet();
        System.out.println("Liste des clés initiales="+cles);
        cles.remove("p");
        System.out.println("Liste des clés après sup: "+cles);
        //
        String old = hm.put("x","25");
        System.out.println("Map après modif de x: "+hm);
        //
        Set<Map.Entry<String,String>> entrees = hm.entrySet();
        Iterator<Map.Entry<String, String>> iter = entrees.iterator();
        while (iter.hasNext()){
            Map.Entry<String,String> entree = iter.next();
            String valeur = entree.getValue();
            if (valeur.equals("20"));{
                System.out.println("Val 20 trouvée en clé: "+entree.getKey());
                iter.remove();
                break;
            }
        }
        System.out.println("Map après sup elem suivant 20: "+hm);

    }
}
