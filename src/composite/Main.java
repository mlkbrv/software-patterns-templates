package composite;

public class Main {
    public static void main(String[] args) {
        Component leaf1 = new Leaf("A");
        Component leaf2 = new Leaf("B");
        Component leaf3 = new Leaf("C");

        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        composite1.add(leaf1);
        composite1.add(leaf2);

        composite2.add(leaf3);
        composite2.add(composite1);

        composite2.execute();
    }
}