package creational.abstractFactory.website;

import creational.abstractFactory.Developer;
import creational.abstractFactory.PManager;
import creational.abstractFactory.ProjectTeamFactory;
import creational.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer createDeveloper() {
        return new PHPDeveloper();
    }

    @Override
    public Tester createTester() {
        return new ManualTester();
    }

    @Override
    public PManager createPManager() {
        return new WebsitePM();
    }
}
