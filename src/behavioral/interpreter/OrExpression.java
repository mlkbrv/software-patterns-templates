package behavioral.interpreter;

public class OrExpression implements Expression {
    Expression e1, e2;
    public OrExpression(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
    @Override
    public boolean interpret(String expression) {
        return e1.interpret(expression) || e2.interpret(expression);
    }
}
