package PRODCONS;

import java.util.concurrent.Semaphore;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int i=10 ;
    public static int [] buffer = new int[i];
    public static Semaphore nbrplacevide = new Semaphore(i);
    public static Semaphore tamponvide = new Semaphore(0);
    public static Semaphore mutex = new Semaphore(1);
    public static void main(String[] args) {
     Producteur p1 = new Producteur("producteur 1");
        Producteur p2 = new Producteur("producteur 2");
        Producteur p3 = new Producteur("producteur 3");
        Producteur p4 = new Producteur("producteur 4");
        Producteur p5 = new Producteur("producteur 5");
        Producteur p6 = new Producteur("producteur 6");
        Producteur p7 = new Producteur("producteur 7");
        Producteur p8 = new Producteur("producteur 8");
        Producteur  p9 = new Producteur("producteur 9");
        Producteur p10 = new Producteur("producteur 10");
     consomateur c1 = new consomateur("consomateur 1");
        consomateur c2 = new consomateur("consomateur 2");
        consomateur c3 = new consomateur("consomateur 3");
        consomateur c4 = new consomateur("consomateur 4" );
        consomateur c5 = new consomateur("consomateur 5");
        consomateur c6 = new consomateur("consomateur 6");
        consomateur c7 = new consomateur("consomateur 7");
        consomateur c8 = new consomateur("consomateur 8");
        consomateur c9 = new consomateur("consomateur 9");
        consomateur c10 = new consomateur("consomateur 10");

        p1.start();
        p2.start();
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
        c7.start();
        c8.start();
        c9.start();
        c10.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();
        p9.start();
        p10.start();


    }
}