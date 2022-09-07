package patterns.abstractfactory;

import patterns.abstractfactory.banking.BankingPM;
import patterns.abstractfactory.banking.BankingTeamFactory;
import patterns.abstractfactory.banking.JavaDeveloper;
import patterns.abstractfactory.banking.QATester;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank system");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
