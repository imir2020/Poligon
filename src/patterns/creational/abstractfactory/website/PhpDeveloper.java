package patterns.creational.abstractfactory.website;

import patterns.creational.abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php dev writes php code");
    }
}
