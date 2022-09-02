package annotations.annotation1;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

//Создать подопытный класс, а этот оставить как класс - анализатор
public class AnnotTest {
   static List<String> list = new ArrayList<>();
    @Test1(name = "Platinum")
    public void testMethod() {
        System.out.println("This method is worked hopefully annotation");
    }

   static void readAnnotation(Class<?> clazz) {
        Method[] methods = clazz.getMethods();

        for (Method m : methods) {
            if (m.isAnnotationPresent(Test1.class)) {
             Test1 test1 = m.getAnnotation(Test1.class);
             String expected = test1.name() + " qwerty";
             list.add(expected);
            }
        }
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Class<AnnotTest> clazz = AnnotTest.class;
        readAnnotation(clazz);


    }
}
