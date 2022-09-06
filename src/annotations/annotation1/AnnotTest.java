package annotations.annotation1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

//Создать подопытный класс, а этот оставить как класс - анализатор
public class AnnotTest {
    static List<String> list = new ArrayList<>();


    static String readAnnotation(Object o) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> clazz = o.getClass();
        Method[] methods = clazz.getMethods();
        String t = "";
        for (Method m : methods) {
            if (m.isAnnotationPresent(Test1.class)) {

                Test1 test1 = m.getAnnotation(Test1.class);
                t = test1.name() + " qwerty " + o.getClass();

                //Как создать новый экземпляр класса без метода newInstance()?
                if(!t.equals("name")) t += "  1/s  "+ clazz.newInstance();//Создаётся новый экземпляр, переданного в параметре, класса.
            }
        }
        return t;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        AnnotTest test = new AnnotTest();
        Lab lab = new Lab();

        try {
            System.out.println(readAnnotation(lab));
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
