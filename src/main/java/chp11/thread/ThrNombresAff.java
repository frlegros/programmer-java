package chp11.thread;

/**
 * Created by frlegros on 26/02/17.
 */
public class ThrNombresAff extends Thread{

    private Nombres nombres;

    public ThrNombresAff(Nombres nombres) {
        this.nombres = nombres;
    }

    public void run() {
        try {
            while (!interrupted()){
                nombres.affiche();
                sleep(75);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
