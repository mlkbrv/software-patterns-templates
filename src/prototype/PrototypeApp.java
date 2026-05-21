package prototype;

public class PrototypeApp {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "Source code");
        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.copyProject();
        System.out.println(masterClone);
    }
}