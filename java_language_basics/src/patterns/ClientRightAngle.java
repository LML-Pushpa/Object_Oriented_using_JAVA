package patterns;

import java.util.Scanner;

public class ClientRightAngle {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enterr the Number of Rows and colums");
		RightAngle r =new RightAngle(sc.nextInt(),sc.nextInt());
		r.RightAngleTriangle();

	}

}
