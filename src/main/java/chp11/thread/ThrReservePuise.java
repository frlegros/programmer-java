package chp11.thread;

/**
 * Created by frlegros on 26/02/17.
 */
public class ThrReservePuise extends Thread {

    private int vol;
    private Reserve r;
    private int delai;

    public ThrReservePuise(Reserve r, int vol, int delai) {
        this.vol = vol;
        this.r = r;
        this.delai = delai;
    }

    public void run(){

        try{
            while (!interrupted()){
                r.puise(vol);
                sleep(delai);
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
