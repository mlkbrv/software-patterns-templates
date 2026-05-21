package decorator;

public class LoggingDecorator extends BaseDecorator {
    public LoggingDecorator(Service service) {
        super(service);
    }

    @Override
    public void write(String data) {
        System.out.println("Log: output initialized");
        super.write(data);
    }
}