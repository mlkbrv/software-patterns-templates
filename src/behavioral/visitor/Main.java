package behavioral.visitor;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();

        Visitor feeder = new FeedVisitor();

        dog.accept(feeder);
        cat.accept(feeder);
    }
}