package ir.edu.farhadi.java.j12.designpatern.prototype;

public class Test {

    public static void main(String[] args) {
        Color.ColorStore.getColor("blue").addColor();
        Color.ColorStore.getColor("black").addColor();
        Color.ColorStore.getColor("black").addColor();
        Color.ColorStore.getColor("blue").addColor();
    }
}
