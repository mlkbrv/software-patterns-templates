package creational.abstractFactory.banking;

import creational.abstractFactory.PManager;

public class BankingPM implements PManager {
    @Override
    public void manageProject()
    {
        System.out.println("Manage Project");
    }
}
