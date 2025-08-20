package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linked_HashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap =new LinkedHashMap<>();
        linkedHashMap.put("bo",20);
        linkedHashMap.put("ko",80);
        linkedHashMap.put("sp",95);

        linkedHashMap.get("bo");

        for(Map.Entry<String,Integer> i:linkedHashMap.entrySet()){
            System.out.println(i);
        }


    }
}
