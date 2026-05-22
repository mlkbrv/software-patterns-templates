package creational.abstractFactory.banking;

import creational.abstractFactory.Developer;
import creational.abstractFactory.PManager;
import creational.abstractFactory.ProjectTeamFactory;
import creational.abstractFactory.Tester;

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
