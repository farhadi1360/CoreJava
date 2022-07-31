package ir.edu.farhadi.java.j20.ai;

import java.util.Queue;

public class FaceDetectionProcessor extends Thread {

       private Queue requestQueue;

       public FaceDetectionProcessor(Queue q) {
               requestQueue = q;
       }

       public void run() {

           synchronized(requestQueue) {

               if (requestQueue.size() >= 1) {
                   System.out.println(Thread.currentThread().getName() + " starts Face Detection Processing ..." );
                   requestQueue.poll();
                   return;
               }

               while ( requestQueue.size() < 1 ) {
                   try {
                       System.out.println( Thread.currentThread().getName() + " is waiting ...");
                       requestQueue.wait();
                   } catch (InterruptedException e) {
                       System.out.println(e.getMessage());
                   }
               }

               System.out.println( Thread.currentThread().getName() + requestQueue.size() + " requests and starts processing...");


           }

       }

}  