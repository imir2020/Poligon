package currency.phaser;

import java.util.concurrent.Phaser;

public class Program {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        new Thread(new PhaseThread(phaser, "PhaseThread 1")).start();
        new Thread(new PhaseThread(phaser, "PhaseThread 2")).start();

        //await  completion of phase0
        int phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + phase + " completed");

        //await completion of phase1
        phase = phaser.getPhase();
        System.out.println("Phase " + phase + " completed");
        phaser.arriveAndAwaitAdvance();


        //await completion of phase2
        phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();

        System.out.println("Phase " + phase + " completed");


    }
}
