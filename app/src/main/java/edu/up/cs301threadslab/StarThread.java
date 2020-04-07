package edu.up.cs301threadslab;

import java.util.Random;

public class StarThread extends Thread {

    private StarAnimation SA;
    private Random random;


    public StarThread(StarAnimation SA) {
        this.SA = SA;
    }

    @Override
    public void run() {
        while (true) {
            super.run();
            try {
                sleep(400);
            } catch (InterruptedException e) {
            }


            if (getRandomBoolean()) {
                SA.addStar();
            } else {

                SA.removeStar();
            }



        }
    }

    public void setAV(StarAnimation SA) {
        this.SA = SA;
    }

    public boolean getRandomBoolean() {
        return random.nextBoolean();
    }

}

