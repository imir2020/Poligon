package patterns.abstractfactory.banking;

import patterns.abstractfactory.Developer;
import patterns.abstractfactory.ProjectManager;
import patterns.abstractfactory.ProjectTeamFactory;
import patterns.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
       return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
