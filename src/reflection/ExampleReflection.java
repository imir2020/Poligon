package reflection;

import reflection.lab.LabMouse;

import java.lang.reflect.InvocationTargetException;

public class ExampleReflection {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        RefChecker checker = new RefChecker();
        LabMouse labMouse = new LabMouse();
        ExampleReflection e = new ExampleReflection();
        //checker.showClassName(labMouse);
        //checker.showFields(labMouse);
        // checker.showMethod(labMouse);
        //checker.showMethod(checker);
        //checker.showFieldAnnotation(labMouse);

        try {
            checker.fillPrivateFields(labMouse);
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }
        System.out.println(labMouse.getAge());
        System.out.println(labMouse.getName());
        System.out.println(labMouse.getAge());


        System.out.println(checker.createNewObj(labMouse));

        Object clone = checker.createNewObj(labMouse);
        System.out.println(clone);

    }
}
