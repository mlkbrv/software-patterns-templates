package abstractFactory.website;

import abstractFactory.PManager;

public class WebsitePM implements PManager {
    @Override
    public void manageProject()
    {
        System.out.println("Manage Project");
    }
}
