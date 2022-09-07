package patterns.abstractfactory.website;

import patterns.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Tester testing code");
    }
}
