package behavioral.visitor;

public class FeedVisitor implements Visitor {

    @Override
    public void visit(Dog dog) {
        System.out.println("feed dog");
    }

    @Override
    public void visit(Cat cat) {
        System.out.println("feed cat");
    }
}
