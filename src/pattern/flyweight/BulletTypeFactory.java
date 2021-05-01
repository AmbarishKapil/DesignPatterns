package pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BulletTypeFactory {
    private static Map<String, BulletType> bulletTypes = new HashMap<>();

    public static BulletType getBulletType(String color, String texture){
         if(bulletTypes.get(color+texture) != null){
             return bulletTypes.get(color+texture);
         }else{
             BulletType b = new BulletType(color, texture);
             bulletTypes.put(color+texture, b);
             return b;
         }
    }
}
