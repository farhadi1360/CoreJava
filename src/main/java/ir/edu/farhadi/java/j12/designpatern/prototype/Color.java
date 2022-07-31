package ir.edu.farhadi.java.j12.designpatern.prototype;

import java.util.HashMap;
import java.util.Map;

public abstract  class Color  implements Cloneable {

    protected String colorName;

    abstract void addColor();


    public Object clone()
    {
        Object clone = null;
        try
        {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }

    static class blueColor extends Color
    {
        public blueColor()
        {
            this.colorName = "blue";
        }

        @Override
        void addColor()
        {
            System.out.println("Blue color added");
        }

    }

    static class blackColor extends Color{

        public blackColor()
        {
            this.colorName = "black";
        }

        @Override
        void addColor()
        {
            System.out.println("Black color added");
        }
    }
    static class ColorStore {

        private static Map<String, Color> colorMap = new HashMap<String, Color>();

       static
        {
            colorMap.put("blue", new blueColor());
            colorMap.put("black", new blackColor());
        }

        public static Color getColor(String colorName)
        {
            return (Color) colorMap.get(colorName).clone();
        }
    }



}
