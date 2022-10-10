package patterns.creational.abstractfactory.website;

import patterns.creational.abstractfactory.ProjectManager;

public class WebSitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Manager manage the project");
    }
}
