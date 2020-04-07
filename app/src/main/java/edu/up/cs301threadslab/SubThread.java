package edu.up.cs301threadslab;

import java.lang.Thread;

public class SubThread extends Thread {

    private AnimationView AV;

    public  SubThread (AnimationView AV)
    {
        this.AV = AV;
    }

    @Override
    public void run() {
        while (true)
        {
            super.run();
            AV.postInvalidate();
            try
            {
                sleep(50);
            }
            catch (InterruptedException e) {}

        }
    }

    public void setAV(AnimationView AV) {
        this.AV = AV;
    }
}
