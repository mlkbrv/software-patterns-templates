package abstractFactory.banking;

import abstractFactory.Developer;
import abstractFactory.PManager;
import abstractFactory.ProjectTeamFactory;
import abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester createTester() {
        return new QA();
    }

    @Override
    public PManager createPManager() {
        return new BankingPM();
    }
}
