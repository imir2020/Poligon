package patterns.abstractfactory.banking;

import patterns.abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java dev writes code");
    }
}
