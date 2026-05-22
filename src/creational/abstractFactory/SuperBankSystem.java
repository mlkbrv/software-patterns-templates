package creational.abstractFactory;

import creational.abstractFactory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.createDeveloper();
        Tester tester = projectTeamFactory.createTester();
        PManager manager = projectTeamFactory.createPManager();

        System.out.println("Creating a banking system");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
