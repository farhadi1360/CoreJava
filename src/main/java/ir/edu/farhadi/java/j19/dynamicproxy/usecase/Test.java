package ir.edu.farhadi.java.j19.dynamicproxy.usecase;

import java.lang.annotation.Annotation;

public class Test {

    public static void main(String[] args) {
//        printClassInfo(TCPProtocol.class);
         }

         private static void printClassInfo(Class c) {

             if (c.isAnnotationPresent(TrafficNet.class)) {
                 TrafficNet trafficNet = (TrafficNet) c.getAnnotation(TrafficNet.class);
                 Object myObject = trafficNet;
                 Annotation myInterface = trafficNet;
                 Class annotationType = myInterface.annotationType();
                 System.out.println( "Annotation Type is : " + annotationType.getName() );
                 System.out.println( "The value is: " + trafficNet.value() );
                 System.out.println( "ClassName: " + trafficNet.getClass().getName() );
                 System.out.println( "Superclass: " + trafficNet.getClass().getSuperclass() );
             }

         }
}
