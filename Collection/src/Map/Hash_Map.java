package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash_Map {
    public static void main(String[] args) {
        HashMap<Integer,String> map =new HashMap<>();
        map.put(1,"Pushpak");
        map.put(2,"Utkarsh");
        map.put(3,"hitesh");
        System.out.println(map);

        String name=map.get(3);
        System.out.println(name);

        for(int i:map.keySet()){
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer,String> entry:entries){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        map.remove(1);

        for(int i:map.keySet()){
            System.out.println(map.get(i));
        }
    }
}
