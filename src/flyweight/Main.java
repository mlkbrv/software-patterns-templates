package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        byte[] standard9mmSprite = new byte[1024 * 1024];
        byte[] tracer9mmSprite = new byte[1024 * 1024];

        BulletType commonType = BulletFactory.getBulletType("9mm", "Gray", standard9mmSprite);
        BulletType tracerType = BulletFactory.getBulletType("9mm-Tracer", "Red", tracer9mmSprite);

        List<Bullet> activeBullets = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            BulletType type = BulletFactory.getBulletType("9mm", "Gray", standard9mmSprite);
            activeBullets.add(new Bullet(0, i * 10, 150, type));
        }

        activeBullets.add(new Bullet(0, 50, 180, tracerType));

        System.out.println("\n--- Initial Render ---");
        for (Bullet bullet : activeBullets) {
            bullet.render();
        }

        System.out.println("\n--- Bullets Moving ---");
        for (Bullet bullet : activeBullets) {
            bullet.move();
            bullet.render();
        }
    }
}