package Array_List;

import java.util.ArrayList;
import java.util.Comparator;

public class Array_List2 implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o2.length()-o1.length();
    }
}
class Main1 {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add("banana");
        list.add("apple");
        list.add("cherry");
        list.add("utkarsh");
        list.add("Hitesh");
        list.add("mohanish");

//        Collections.sort(list);
//        System.out.println(list);

        list.sort(new Array_List2());
        System.out.println(list);
    }
}
