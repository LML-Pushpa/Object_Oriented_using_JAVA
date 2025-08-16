package Array_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ArrayList1 implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1; // Descending order //Here 5 3 // 3 5
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(50);
        list.add(30);
        list.add(40);

        // Default Ascending
        Collections.sort(list);
        System.out.println("Ascending: " + list);

        // Now descending
        Collections.sort(list, new ArrayList1());
        System.out.println("Descending: " + list);
    }
}
