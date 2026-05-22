package creational.abstractFactory.website;

import creational.abstractFactory.PManager;

public class WebsitePM implements PManager {
    @Override
    public void manageProject()
    {
        System.out.println("Manage Project");
    }
}
