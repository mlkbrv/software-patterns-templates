package abstractFactory.website;

import abstractFactory.Developer;
import abstractFactory.PManager;
import abstractFactory.ProjectTeamFactory;
import abstractFactory.Tester;

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
