package odd_Even;

import java.util.Scanner;

public class ClientOddEven {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		CheckOddEven c =new CheckOddEven(sc.nextInt());
		
		System.out.println(c.CheckOddEven());
		

	}

}
