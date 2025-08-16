package Linked_List;

import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> list =new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        for(int x:list){
            System.out.println(x);
        }

        list.addFirst(5);

        for(int x:list){
            System.out.println(x);
        }

        list.addLast(50);

        for(int x:list){
            System.out.println(x);
        }

        list.removeIf(x->x%2==0);

        for(int x:list){
            System.out.println(x);
        }
    }
}

