package behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobsite = new JavaDeveloperJobSite();
        jobsite.addVacancy("Junior Java Developer");
        jobsite.addVacancy("Senior Java Developer");
        jobsite.addVacancy("Junior Java Intern");

        Observer subscriber = new Subscriber("Emil Akbarov");
        Observer subscriber2 = new Subscriber("Emil Akbarov2");

        jobsite.addObserver(subscriber);
        jobsite.addObserver(subscriber2);

        jobsite.addVacancy("Junior Java Developer");

        jobsite.removeVacancy("Junior Java Developer");
    }
}
