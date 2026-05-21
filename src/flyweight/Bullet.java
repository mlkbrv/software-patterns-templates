package flyweight;

public class Bullet {
    private int x;
    private int y;
    private int velocity;
    private BulletType type;

    public Bullet(int x, int y, int velocity, BulletType type) {
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        this.type = type;
    }

    public void move() {
        x += velocity;
    }

    public void render() {
        type.display(x, y, velocity);
    }
}