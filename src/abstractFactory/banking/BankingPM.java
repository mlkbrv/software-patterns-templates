package abstractFactory.banking;

import abstractFactory.PManager;

public class BankingPM implements PManager {
    @Override
    public void manageProject()
    {
        System.out.println("Manage Project");
    }
}
