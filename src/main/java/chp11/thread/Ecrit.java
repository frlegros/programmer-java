package chp11.thread;

/**
 * Created by frlegros on 26/02/17.
 */
public class Ecrit extends Thread{

    private String texte;
    private int nb;
    private long attente;

    public Ecrit(String texte, int nb, long attente) {
        this.texte = texte;
        this.nb = nb;
        this.attente = attente;
    }

    public void run(){
        try{

            for (int i=0;i<nb;i++){
                System.out.println(texte);
                sleep(attente);
            }
        }catch (InterruptedException e){
            // Impose par sleep
            e.printStackTrace();
        }

    }
}
