package behavioral.visitor;

public class Dog implements Animal {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void bark() {
        System.out.println("gav");
    }
}