package behavioral.interpreter;

public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }
    @Override
    public boolean interpret(String expression) {
        if(expression.contains(data)){
            return true;
        }
        return false;
    }
}
