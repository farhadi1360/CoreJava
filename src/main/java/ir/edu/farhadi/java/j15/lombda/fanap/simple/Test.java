package ir.edu.farhadi.java.j15.lombda.fanap.simple;

import ir.edu.farhadi.java.j15.lombda.fanap.simple.ConsoleLog;

public class Test {

    public static void main(String[] args) {
//        Logger logger = new ConsoleLog();
//        logSystem(logger);

//        logSystem(
//        public void doLog() {
//            System.out.println(" Log is doing !!!!");
//        }
//        )
//
//        Logger logger = (systemName) -> System.out.println(" Core Banking".concat(systemName));
//        logSystem(logger);

        Logger logger = (systemName) ->  "Core Banking".concat(systemName);
        logSystem(logger);

    }

    public static void logSystem(Logger logger){
//        logger.doLog("!!");
        String result = logger.getLog("!!");
        System.out.println(result);
    }
}
