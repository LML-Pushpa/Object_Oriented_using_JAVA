package greaterNumber;

import java.util.Scanner;

public class ClientGreater {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three number");
		
		Greater gc =new Greater(sc.nextInt(),sc.nextInt(),sc.nextInt());
		
		System.out.println("Greater Number is : "+gc.WhichGreater());

	}

}
