package chp11.thread;

/**
 * Created by frlegros on 26/02/17.
 */
public class EcritInterrupted extends Thread{

    private String texte;
    private long attente;

    public EcritInterrupted(String texte, long attente) {
        this.texte = texte;
        this.attente = attente;
    }

    public void run(){
        try{

            while (true){
                if(interrupted()) return;
                System.out.println(texte);
                sleep(attente);
            }
        }catch (InterruptedException e){
            // Impose par sleep
            e.printStackTrace();
        }

    }
}
