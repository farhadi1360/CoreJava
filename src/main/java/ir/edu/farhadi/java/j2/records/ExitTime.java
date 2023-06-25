package ir.edu.farhadi.java.j2.records;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public record ExitTime(LocalDate exitTime) implements Serializable {

    public ExitTime{
        Objects.requireNonNull(exitTime);
    }
}
