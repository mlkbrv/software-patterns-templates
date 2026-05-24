package behavioral.strategy;

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setActivity(new Training());
        developer.executeActivity();
        developer.setActivity(new Coding());
        developer.executeActivity();
        developer.setActivity(new Coding());
        developer.executeActivity();
    }
}
