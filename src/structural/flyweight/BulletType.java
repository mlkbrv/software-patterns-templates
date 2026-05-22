package structural.flyweight;

public class BulletType {
    private String name;
    private String color;
    private byte[] heavySpriteData;

    public BulletType(String name, String color, byte[] heavySpriteData) {
        this.name = name;
        this.color = color;
        this.heavySpriteData = heavySpriteData;
    }

    public void display(int x, int y, int velocity) {
        System.out.println("Bullet '" + name + "' [" + color + "] at (" + x + ", " + y + ") moving at speed " + velocity);
    }
}