package ir.edu.farhadi.java.j18.mix;

import ir.edu.farhadi.java.j18.Annotations.values.PolicyCheck;
import ir.edu.farhadi.java.j18.Annotations.values.Product;
import ir.edu.farhadi.java.j18.Annotations.values.Validation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException {
//        testFieldValidation();
        testMethodValidation("Admin");

    }

        private static void testFieldValidation() throws InstantiationException, IllegalAccessException {
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
                        if(validation.min()<0){
                            System.out.println("Validation is failed ");
                        }else{
                            Object object = c.newInstance();
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
        }

        private static void testMethodValidation(String userPassedInRuntime) throws InstantiationException, IllegalAccessException, InvocationTargetException {
            Class c = Product.class;
            Method[] methods = c.getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(PolicyCheck.class)) {
                    PolicyCheck policyCheck = method.getAnnotation(PolicyCheck.class);
                    if(policyCheck!=null){
                        if (userPassedInRuntime.equalsIgnoreCase(policyCheck.user())) {
                            Object obj = c.newInstance();
                            method.setAccessible(true);
                            method.invoke(obj);
                            System.out.println("Product was Created By "+userPassedInRuntime);
                        }else{
                            System.out.println("You Have Not Permeation For Saving Product");
                        }
                    }
                }
            }
        }



 /*
            in the  Normal  Mode we should be use this format

            new Object()
            object.method()
            obj.setField(v)
            obj.getField()
             in the  Reflection  Mode we should be use this format
             class.newInstance()
             method.invoke(obj);
              f.setField(obj,v);
               f.getField(obj);
     */

}
