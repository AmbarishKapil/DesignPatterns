package pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BulletTypeFactory {
    private static Map<String, BulletType> bulletTypes = new HashMap<>();

    public static BulletType getBulletType(String color, String texture){
         if(bulletTypes.get(color+texture) != null){
             return bulletTypes.get(color+texture);
         }else{
             return new BulletType(color, texture);
         }
    }
}
