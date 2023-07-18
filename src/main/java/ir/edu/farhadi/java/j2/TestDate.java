package ir.edu.farhadi.java.j2;

import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Reception reception = new Reception();


        Date entrance = new Date("1399");
        Date exit = new Date("1400");


        reception.calculateDate(exit,entrance);

        EntranceDateImutable entranceDateImutable = new EntranceDateImutable(entrance);
        ExitDateImutable exitDateImutable = new ExitDateImutable(exit);
//
//        Integer num1 = new Integer(100);
//
        reception.calculateImautableDate(entranceDateImutable,exitDateImutable);
    }
}
