package ir.edu.farhadi.java.j4.encapsolations;

public class SampleForThis {
    int price; // put in heap

    void increase(){
        this.price++;
    }

    void reWrite(int price) { // parameter as a  local variable and put in  stack frame
        this.price = price;
    }


}
