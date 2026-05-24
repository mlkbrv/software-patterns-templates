package behavioral.visitor;

public class Cat implements Animal {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void meow() {
        System.out.println("meow");
    }
}
