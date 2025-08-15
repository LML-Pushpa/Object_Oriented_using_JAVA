package arrayList;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		//Dynamic and ordered
		ArrayList<Integer> list =new ArrayList<Integer>();
		//Add
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		list.remove(2);//Index second remove
		
		list.add(3, 60);//Insert at index
		list.set(2, 100);//replace index value
		
		//Iterating List
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		for(int x: list) {
			System.out.println(x);
		}
		
		
		//To check exist of value 
		System.out.println(list.contains(50));
		System.out.println(list.contains(90));
		
		//display
		System.out.println(list);
	}

}
