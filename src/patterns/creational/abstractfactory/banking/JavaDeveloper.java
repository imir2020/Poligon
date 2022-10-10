package patterns.creational.abstractfactory.banking;

import patterns.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java dev writes code");
    }
}
