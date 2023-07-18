package ir.edu.farhadi.java.j2;

import java.util.Date;

public class EntranceDateImutable {
    Date entrance = new Date("1399");

    public EntranceDateImutable(Date entrance) {
        this.entrance = entrance;
    }

    public Date getEntrance() {
        return entrance;
    }


}
