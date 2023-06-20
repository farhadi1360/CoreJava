package ir.edu.farhadi.java.j2;

import java.util.Date;

public class ExitDateImutable {
    Date exit = new Date("1400");

    public ExitDateImutable(Date exit) {
        this.exit = exit;
    }

    public Date getExit() {
        return exit;
    }
}
