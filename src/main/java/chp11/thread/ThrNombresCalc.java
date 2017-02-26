package chp11.thread;

/**
 * Created by frlegros on 26/02/17.
 */
public class ThrNombresCalc extends Thread{

    private Nombres nombres;

    public ThrNombresCalc(Nombres nombres) {
        this.nombres = nombres;
    }

    public void run() {
        try {
            while (!interrupted()){
                nombres.calcul();
                sleep(50);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
