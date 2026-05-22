package structural.decorator;

public class Main {
    public static void main(String[] args) {
        Service service = new BaseService();

        Service encryptedService = new EncryptionDecorator(service);

        Service loggedAndEncryptedService = new LoggingDecorator(encryptedService);

        loggedAndEncryptedService.write("Hello World");
    }
}