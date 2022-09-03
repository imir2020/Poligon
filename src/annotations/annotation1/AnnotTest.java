package annotations.annotation1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

//Создать подопытный класс, а этот оставить как класс - анализатор
public class AnnotTest {
    static List<String> list = new ArrayList<>();


    static String readAnnotation(Object o) {
        Class<?> clazz = o.getClass();
        Method[] methods = clazz.getMethods();
        String t = "";
        for (Method m : methods) {
            if (m.isAnnotationPresent(Test1.class)) {
                //Получаем доступ к атрибутам
                Test1 test1 = m.getAnnotation(Test1.class);
                t = test1.name();
            }
        }
        return t;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        AnnotTest test = new AnnotTest();
        Lab lab = new Lab();

        System.out.println(readAnnotation(lab));


    }
}
