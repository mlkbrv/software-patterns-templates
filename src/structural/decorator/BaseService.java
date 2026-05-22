package structural.decorator;

public class BaseService implements Service {
    @Override
    public void write(String data) {
        System.out.println("Writing data: " + data);
    }
}