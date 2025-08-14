package primeNumber;

import java.util.Scanner;

public class ClientPrimeNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number");
		PrimeNumber pm =new PrimeNumber(sc.nextInt());
		System.out.println(pm.isPrime());
	}

}
