package ir.edu.farhadi.java.j14;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class JCF {

   static int PEOPLE_COUNT = 1_000_000;
    static int FEATURE_DIMENSIONS = 512;


    public static void main(String[] args) {

        System.out.println("Number of Cores: " + Runtime.getRuntime().availableProcessors());
        System.out.println("===============================");
        new JCF().createThread(8);
    }

    void createThread(int numberOfThreads) {

        Random random = new Random();
        float[] mostafa = new float[FEATURE_DIMENSIONS];
        float[][] people = new float[PEOPLE_COUNT][FEATURE_DIMENSIONS];

        for (int i = 0; i < FEATURE_DIMENSIONS; i++) {
            mostafa[i] = random.nextFloat();
        }

        for (int j = 0; j < PEOPLE_COUNT; j++) {
            for (int i = 0; i < FEATURE_DIMENSIONS; i++) {
                people[j][i] = random.nextFloat();
            }
        }

        long start = System.currentTimeMillis();

        ExecutorService pool = Executors.newFixedThreadPool(numberOfThreads);

        for (int i=0; i < numberOfThreads; i++) {
            int partiotionSize = PEOPLE_COUNT / numberOfThreads;
            int from = i * partiotionSize;
            int to = from + partiotionSize;
            System.out.println("Create new Thread from " + from + " to: " + to);
            pool.submit( new ChangeThread(mostafa,people, from, to) );
        }

        pool.shutdown();

        try { // Assume 1 minute, for all threads to be done!
            pool.awaitTermination(1, TimeUnit.MINUTES);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("Number of Threads: " + numberOfThreads);
        System.out.println("Time (s): " + (end-start)/1000.0);

    }

}

class ChangeThread implements Runnable {

    private float[] mostafaList;
    private float[][] peopleList;
    private int from;
    private int to;

    public ChangeThread(float[] mostafaList,float[][]  peopleList, int from, int to) {
        this.mostafaList = mostafaList;
        this.peopleList = peopleList;
        this.from = from;
        this.to = to;
    }

    public void run() {

        float[] distances = new float[JCF.PEOPLE_COUNT];

        for (int j = from; j < to; j++) {
            for (int i = 0; i < JCF.FEATURE_DIMENSIONS; i++) {
                distances[j] += mostafaList[i] * peopleList[j][i];
            }
//            System.out.println(distances[j]);
        }

    }

}
