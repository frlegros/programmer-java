package chp11.thread;

/**
 * Created by frlegros on 26/02/17.
 */
public class Reserve {

    private int stock=500;

    public synchronized void puise(int v) throws InterruptedException{

        if (v <= stock){
            System.out.print("-- on puise "+v);
            stock -= v;
            System.out.println(" et il reste "+stock);
        }else{
            System.out.print("** stock de "+stock+" insuffisant pour puiser "+v);
            wait();
        }
    }

    public synchronized void ajoute(int v){
        stock += v;
        System.out.print("-- on ajoute "+v+" et il y a maintenant "+stock);
        notifyAll();
    }
}
