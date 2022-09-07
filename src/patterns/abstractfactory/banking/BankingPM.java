package patterns.abstractfactory.banking;

import patterns.abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking projects");
    }
}
