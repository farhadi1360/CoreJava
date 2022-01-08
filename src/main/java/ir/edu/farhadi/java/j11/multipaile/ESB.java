package ir.edu.farhadi.java.j11.multipaile;

/**
 * these are a lot of samples for learning core java
 *
 * @author Mostafa.Farhadi c@2021
 */
public class ESB implements HttpRest,FileSystem{


    @Override
    public void contractMode() {

        HttpRest.super.contractMode();

        FileSystem.super.contractMode();


        System.out.println(" ESB can handle multi contract");
    }
}
