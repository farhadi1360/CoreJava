package ir.edu.farhadi.java.j10;

import ir.edu.farhadi.java.j6.Human;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class GenericBounded<T extends Human> {
    T humanFamily;

    public T getHumanFamily() {
        return humanFamily;
    }

    public void setHumanFamily(T humanFamily) {
        this.humanFamily = humanFamily;
    }
}
