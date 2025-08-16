package Vector;

import java.util.Vector;

public class Vector_List {
    public static void main(String[] args) {
        Vector<Integer> vec =new Vector<>();
        vec.add(10);
        vec.add(20);
        vec.add(30);
        vec.add(40);
        vec.add(50);

        vec.remove(0);

        for(int i:vec){
            System.out.println(i);
        }

        //used for thread synchronisation
    }
}
