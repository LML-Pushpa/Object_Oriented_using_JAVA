package Array_List;

import java.util.ArrayList;
import java.util.Comparator;

public class Array_List3 implements Comparator<Array_List3> {
    public String name;
    public int marks;

    public Array_List3(){
        name="default";
        marks=0;
    }

    public Array_List3(String name,int marks){
        this.name=name;
        this.marks=marks;
    }

    public void display() {
        System.out.println(name + " " + marks);
    }

    @Override
    public int compare(Array_List3 o1, Array_List3 o2) {
        return o2.marks-o1.marks;
    }
}
class Main2{
    public static void main(String[] args) {
        ArrayList<Array_List3> list =new ArrayList<>();
        list.add(new Array_List3("Charlii",50));
        list.add(new Array_List3("bob",70));
        list.add(new Array_List3("chirag" ,90));

        list.sort(new Array_List3());

        for(Array_List3 a:list){
            a.display();
        }
    }
}
