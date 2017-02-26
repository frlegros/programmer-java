package chp11.thread;

/**
 * Created by frlegros on 26/02/17.
 */
public class ThrReserveAjout extends Thread {

    private int vol;
    private Reserve r;
    private int delai;

    public ThrReserveAjout(Reserve r, int vol, int delai) {
        this.vol = vol;
        this.r = r;
        this.delai = delai;
    }

    public void run(){

        try{
            while (!interrupted()){
                r.ajoute(vol);
                sleep(delai);
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
