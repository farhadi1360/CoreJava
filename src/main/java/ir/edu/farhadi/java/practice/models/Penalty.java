package ir.edu.farhadi.java.practice.models;

import java.time.LocalDateTime;

public abstract class Penalty {


    private LocalDateTime timeOfEvent;

    public LocalDateTime getTimeOfEvent() {
        return timeOfEvent;
    }

    public void setTimeOfEvent(LocalDateTime timeOfEvent) {
        this.timeOfEvent = timeOfEvent;
    }
}
