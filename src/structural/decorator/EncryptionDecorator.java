package structural.decorator;

public class EncryptionDecorator extends BaseDecorator {
    public EncryptionDecorator(Service service) {
        super(service);
    }

    @Override
    public void write(String data) {
        String encrypted = encrypt(data);
        super.write(encrypted);
    }

    private String encrypt(String data) {
        return "Encrypted(" + data + ")";
    }
}