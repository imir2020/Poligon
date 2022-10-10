package patterns.creational.abstractfactory.website;

import patterns.creational.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Tester testing code");
    }
}
