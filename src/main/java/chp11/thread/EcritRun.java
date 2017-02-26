package chp11.thread;

/**
 * Created by frlegros on 26/02/17.
 */
public class EcritRun implements Runnable{


    private String texte;
    private int nb;
    private long attente;

    public EcritRun(String texte, int nb, long attente) {
        this.texte = texte;
        this.nb = nb;
        this.attente = attente;
    }

    public void run() {

        for(int i=0;i<nb;i++){
            System.out.println(texte);
            try{
                Thread.sleep(attente);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
