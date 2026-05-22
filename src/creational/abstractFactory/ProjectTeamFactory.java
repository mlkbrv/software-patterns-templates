package creational.abstractFactory;

public interface ProjectTeamFactory {
    Developer createDeveloper();
    Tester createTester();
    PManager createPManager();
}
