package decorator;

public abstract class BaseDecorator implements Service {
    protected Service wrapper;

    public BaseDecorator(Service service) {
        this.wrapper = service;
    }

    @Override
    public void write(String data) {
        wrapper.write(data);
    }
}