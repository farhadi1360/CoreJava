package ir.edu.farhadi.java.j2.records;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
         EnterTime enterTime = new EnterTime(LocalDate.now());
//        ExitTime exitTime = new ExitTime(LocalDate.of(2020, 02, 16));
        ExitTime exitTime = new ExitTime(null);

        checkDate(enterTime,exitTime);

    }

    private static void checkDate(EnterTime enterTime, ExitTime exitTime){

    }
}
