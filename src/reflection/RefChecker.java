package reflection;

import reflection.lab.MouseAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RefChecker {

    void showClassName(Object o) {
        Class cl = o.getClass();
        System.out.println(cl.getName());
    }

    void showFields(Object o) {
        Class clz = o.getClass();
        Field[] fields = clz.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getName());
        }
    }

    void showMethod(Object o) {
        Class clz = o.getClass();
        Method[] methods = clz.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
    }

    void showFieldAnnotation(Object o) {
        Class clz = o.getClass();
        Field[] fields = clz.getDeclaredFields();
        for (Field f : fields) {
            Annotation[] annotations = f.getAnnotations();
            for (Annotation a : annotations) {
                System.out.println(f.getName() + " " + a + " " + f.getModifiers());
            }
        }
    }

    void fillPrivateFields(Object o) throws IllegalAccessException {
        Class clz = o.getClass();
        Field[] fields = clz.getDeclaredFields();
        for (Field f : fields) {
            Annotation annotation = f.getAnnotation(MouseAnnotation.class);
            if (annotation == null) continue;
            f.setAccessible(true);//transform "private" from "public"
            f.set(o, "Field");
            f.setAccessible(false);
        }
    }

    Object createNewObj(Object o) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class clz = o.getClass();
        return clz.getDeclaredConstructor().newInstance();
    }
    public static void main(String[] args) {

    }
}
