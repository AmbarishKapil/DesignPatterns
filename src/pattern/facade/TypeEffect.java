package pattern.facade;

import java.util.HashMap;
import java.util.Map;

public class TypeEffect {
    private Map<String,String> effective = new HashMap<>();

    public TypeEffect() {
        effective.put("water", "fire");
        effective.put("fire", "grass");
        effective.put("grass", "water");
    }

    public double isTypeEffective(String attackerType, String receiverType){
        if(effective.get(attackerType).equals(receiverType)){
            return 1.3d;
        }

        return 1d;
    }
}
