package Accenture;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Coding1 {
	public int Test(int[] arr) {
		
		ArrayList<Integer> even =new ArrayList<Integer>();
		
		ArrayList<Integer> odd =new ArrayList<Integer>();
		
		even.add(arr[0]);
		
		for(int i=1;i<arr.length;i++) {
			if(i%2==0) {
				even.add(arr[i]);
			}
			else {
				odd.add(arr[i]);
			}
		}
		
		Collections.sort(even);
		for(int x:even) {
			System.out.print(x);
		}
		Collections.sort(odd);
		
		return even.get(even.size()-2)+odd.get(1);
	}
}
