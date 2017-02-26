package chp11.thread;

/**
 * Created by frlegros on 26/02/17.
 */
public class EcritRun2 implements Runnable{


    private String texte;
    private int nb;
    private long attente;

    public EcritRun2(String texte, int nb, long attente) {
        this.texte = texte;
        this.nb = nb;
        this.attente = attente;
    }

    public void start(){

        Thread t = new Thread(this);
        t.start();
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
