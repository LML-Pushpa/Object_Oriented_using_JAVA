package Array_List;

import java.util.ArrayList;

import static java.util.Collections.sort;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(50);
        list.add(40);
        System.out.println(list);

        //iterate through loop
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
        for(int x:list){
            System.out.println(x);
        }

        //contains
        System.out.println(list.contains(30));
        System.out.println(list.contains(60));

        //sort
        sort(list);
        System.out.println(list);

        //updating value
        list.add(4,100);
        list.set(4,80);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

    }
}
