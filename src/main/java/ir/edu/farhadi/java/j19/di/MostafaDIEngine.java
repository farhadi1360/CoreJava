package ir.edu.farhadi.java.j19.di;

import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.Properties;

public final class MostafaDIEngine {
    private static final String configFile = "src/main/java/ir/edu/farhadi/java/j19/di/context.txt";

    public void injection(Object target) {
        try {
            Class c = target.getClass();
            for (Field field : c.getDeclaredFields()) {
                if (field.isAnnotationPresent(MostafaAutowired.class)){
                    field.setAccessible(true);
                    MostafaAutowired annotatedField = field.getAnnotation(MostafaAutowired.class);
                    if (annotatedField != null) field.set( target, getBean( annotatedField.bean() ) );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private Object getBean(String bean) {

        Object obj = null;
        Properties p = new Properties();
        try {
            p.load( new FileInputStream(configFile) );
            Class type = Class.forName( p.getProperty(bean));
            obj = type.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
