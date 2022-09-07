package patterns.abstractfactory.website;

import patterns.abstractfactory.ProjectManager;

public class WebSitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Manager manage the project");
    }
}
