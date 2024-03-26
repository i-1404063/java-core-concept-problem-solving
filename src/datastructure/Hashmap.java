package datastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {

    public static void main(String... args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Bangladesh", 18);
        map.put("China", 150);
        map.put("US", 30);

        if (map.containsKey("China")) {
            System.out.println("China's population is about " + map.get("China") + " Cr");
        }

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println(map.get(key));
        }
    }
}
