package structural.bridge;

public class BankSystem extends Program{
    public BankSystem(Developer developer) {
        super(developer);
    }
    @Override
    public void developProgram() {
        System.out.println("BankSystem developProgram");
        developer.writeCode();
    }
}
