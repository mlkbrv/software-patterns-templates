package behavioral.memento;

public class Main {
    public static void main(String[] args) {
        Project project = new Project();
        GithubRepo githubRepo = new GithubRepo();

        System.out.println("Creating new project version 1.0");

        project.setVersionAndDate("Version 1.0");
        System.out.println(project);
        System.out.println("Saving current version to github....");
        githubRepo.setSave(project.save());
        System.out.println("Updating current version to 1.1");
        System.out.println("Writing poor code");
        project.setVersionAndDate("Version 1.1");
        System.out.println(project);
        System.out.println("Smth went wrong");

        System.out.println("Rollback");
        project.load(githubRepo.getSave());

        System.out.println("Project after rollback");
        System.out.println(project);
    }
}
