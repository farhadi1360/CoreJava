package ir.edu.farhadi.java.j18.mix;

import ir.edu.farhadi.java.j18.Annotations.values.Product;
import ir.edu.farhadi.java.j18.Annotations.values.Validation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Class c = Product.class;
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Validation.class)) {
                Validation validation = field.getAnnotation(Validation.class);
                if (validation != null) {
                    Annotation annotation = validation;
                    Class classAnnotated = annotation.annotationType();
                    System.out.println( "Annotation Class Is : " + classAnnotated.getName() );
                    System.out.println( "The min value attribute is: " + validation.min() );
                    System.out.println( "The max value attribute is: " + validation.max() );

                    Object object = c.newInstance(); //
                    field.setAccessible(true);
                    try {
                        field.set(object,new Double(validation.max()));
                            Product studentCreated = (Product) object;
                            System.out.println("New Product price is :" +studentCreated.getPrice());
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }


 /*
             Normal        Reflection

            new X()       c.newInstance()
            obj.m()       m.invoke(obj);
            obj.setF(v)   f.set(obj,v);
            obj.getF()    f.get(obj);
     */

}
