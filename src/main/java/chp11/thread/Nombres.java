package chp11.thread;

/**
 * Created by frlegros on 26/02/17.
 */
public class Nombres {

    private int n, carre;
    private boolean pret=false;


    public synchronized void calcul() throws InterruptedException{
        if(!pret){
            n++;
            carre = n * n;
            pret=true;
            notifyAll();
        }else
            wait();
    }

    public synchronized void affiche() {
        try{
            if(pret){
                System.out.println(n + " a pour carré : " + carre);
                notifyAll();
                pret=false;
            }else
                wait();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public boolean pret() {
        return pret;
    }
}
