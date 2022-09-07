package patterns.abstractfactory.website;

import patterns.abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php dev writes php code");
    }
}
