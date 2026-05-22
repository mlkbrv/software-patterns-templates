package structural.composite;

public class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println("Leaf " + name + " executed.");
    }
}