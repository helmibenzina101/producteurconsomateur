package PRODCONS;

import static PRODCONS.Main.*;
import static PRODCONS.Main.nbrplacevide;
public class Producteur extends Thread {
public static int in = 0; //partagee entre les producteurs
    private  String name;
    public Producteur(String name) {
        this.name = name;
    }

    @Override

    public void run() {
        try {
            nbrplacevide.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            mutex.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        produire();
        mutex.release();
        tamponvide.release();


    }
    public void produire() {
      int x = (int) (Math.random() * 100);
        Main.buffer[in] = x;
        in =(++in)%Main.i;
        System.out.println(name+" Produit : "+x);
    }
}

