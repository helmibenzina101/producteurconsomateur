package PRODCONS;

import static PRODCONS.Main.*;

public class consomateur extends Thread{
    private String name;
    public consomateur(String name){
        this.name = name;
    }



    public static int out = 0;
    public void run(){
        try {
            tamponvide.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            mutex.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        consommer();
        mutex.release();
        nbrplacevide.release();
    }
    public void consommer(){
        int x = Main.buffer[out];
        System.out.println(name+" Consommer : "+x);
        out = (++out)%Main.i;
    }
}
