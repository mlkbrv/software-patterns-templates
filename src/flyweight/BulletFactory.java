package flyweight;

import java.util.HashMap;
import java.util.Map;

public class BulletFactory {
    private static final Map<String, BulletType> bulletTypes = new HashMap<>();

    public static BulletType getBulletType(String name, String color, byte[] heavySpriteData) {
        String key = name + "_" + color;
        BulletType result = bulletTypes.get(key);

        if (result == null) {
            result = new BulletType(name, color, heavySpriteData);
            bulletTypes.put(key, result);
            System.out.println(">>> Created NEW BulletType object for: " + key);
        }

        return result;
    }
}