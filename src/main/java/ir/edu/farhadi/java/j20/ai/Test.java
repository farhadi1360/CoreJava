package ir.edu.farhadi.java.j20.ai;

import java.util.LinkedList;
import java.util.Queue;

public class Test {

    public static void main(String[] args) {

            Queue<FaceDetection> q = new LinkedList<>();
            q.offer( new FaceDetection("Mustafa") );

            new FaceDetectionProcessor( q ).start();
            new FaceDetectionProcessor( q ).start();
            new FaceDetectionProcessor( q ).start();
        
            try {Thread.sleep(2*1000); } catch (InterruptedException e) {e.printStackTrace(); }
            System.out.println("Face  offers 2 more images to the queue ...");
            try {Thread.sleep(2*1000); } catch (InterruptedException e) {e.printStackTrace(); }

            q.offer( new FaceDetection("Javad") );
            q.offer( new FaceDetection("Hadi") );

            System.out.println("Face Detection Processor  notifies all...");
            synchronized(q) { q.notifyAll(); }



        
    }

}