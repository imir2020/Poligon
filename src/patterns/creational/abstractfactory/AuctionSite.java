package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.website.WebSiteTeamFactory;

public class AuctionSite {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();
        Tester tester = projectTeamFactory.getTester();

        System.out.println("Creating Auction website");
        developer.writeCode();
        projectManager.manageProject();
        tester.testCode();
    }
}
