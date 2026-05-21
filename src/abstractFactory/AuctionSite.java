package abstractFactory;

import abstractFactory.website.WebsiteTeamFactory;

public class AuctionSite {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.createDeveloper();
        Tester tester = projectTeamFactory.createTester();
        PManager manager = projectTeamFactory.createPManager();

        System.out.println("Creating a new auction site");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
