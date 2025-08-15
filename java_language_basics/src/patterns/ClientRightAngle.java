package patterns;

import java.util.Scanner;

public class ClientRightAngle {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int choice=0;
		System.out.println("Select Pattern");
		System.out.println("1.solid RIGHT ANGLE TRIANGLE");
		System.out.println("2.solid SQUQRE");
		choice=sc.nextInt();
		switch(choice) {
			case 1:
				System.out.println("Enter the Number of Rows and colums");
				Pattern p=new Pattern(sc.nextInt(),sc.nextInt());
				p.RightAngleTriangle();
			case 2:
				System.out.println("Enter the Number of Rows and colums");
				Pattern p1=new Pattern(sc.nextInt(),sc.nextInt());
				p1.SolidSquare();
			default :
				System.out.println("Invalid Choice");
			}

	}

}
