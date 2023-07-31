package ir.edu.farhadi.java.j15.lombda.fanap.simple;

import ir.edu.farhadi.java.j15.lombda.fanap.simple.ConsoleLog;

import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) {
//        Logger logger = new ConsoleLog();
//        logSystem(logger);
//
//        logSystem(
//        () -> {System.out.println(" Log is doing !!!!"); });

//          logSystem(
//            (s)-> {
//                System.out.println(" Log is doing !!!!".concat(s));
//            }
//        );

        Logger logger = (systemName) -> " Core Banking   ".concat(systemName);

        String result = logger.getLog("Fanap Plus");
        System.out.println(result);
//        logger.doLog("Fanap ");
//        logSystem(logger);


//        Logger logger = (systemName) ->  "Core Banking".concat(systemName);
//        logSystem(logger);

//**************************** using Consumer ****************
        Consumer<String> mStringConsumer = s -> System.out.println(s);
//        mStringConsumer.accept(" Mostafa Farhadi");


    }

    public static void logSystem(Logger logger) {
//        logger.doLog();
//        logger.doLog("Fanap ");
//        String result = logger.getLog("!!");
//        System.out.println(result);
    }
}
