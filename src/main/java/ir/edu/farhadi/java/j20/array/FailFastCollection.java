package ir.edu.farhadi.java.j20.array;

import com.googlecode.gwt.crypto.util.Str;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
//        List<String> list = new CopyOnWriteArrayList();
        list.add("Mustafa");
        list.add("Javad");
        list.add("Hadi");

        new Display(list).start();
        new Modify(list).start();
        System.out.println("********Finally List is *******");
        new Display(list).start();

    }


   static class Display  extends Thread {
       List<String>  list;
        Display(List<String>  list) {
            this.list = list;
        }

        @Override
        public void run() {
            for (Iterator it = list.iterator(); it.hasNext(); ) {
                System.out.println( it.next() );
                try { Thread.sleep(100); } catch(Exception e) {}
            }
//            for (String str : list) {
//                System.out.println(str);
//            }
        }
    }

   static class Modify  extends Thread {
       List list;
        public Modify(List<String>  list) {
            this.list = list;
        }
       @Override
       public void run() {
           list.add("Esmaiel");
           list.add("Bahman");
               try { Thread.sleep(100); } catch(Exception e) {}
           }
       }
   }



