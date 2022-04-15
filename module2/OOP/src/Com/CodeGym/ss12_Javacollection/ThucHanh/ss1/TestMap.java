package Com.CodeGym.ss12_Javacollection.ThucHanh.ss1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> Hashmap = new HashMap<>();
        Hashmap.put("Huy",23);
        Hashmap.put("Hoàng",22);
        Hashmap.put("Hoa",21);
        Hashmap.put("Tuyết",20);
        System.out.println(Hashmap + "\n");
        Map<String, Integer> Treemap = new TreeMap<>(Hashmap);
        System.out.println(Treemap + "\n");
        Map<String, Integer> Linked = new LinkedHashMap<>(16,0.75f,true);
        Linked.put("A",10);
        Linked.put("B", 11);
        Linked.put("C", 12);
        System.out.println(Linked.get("B") + "\n");
    }
}
