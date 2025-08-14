package Odd_Even;

public class CheckOddEven {
	public int num;
	
	public CheckOddEven() {
		num=0;
	}
	
	public CheckOddEven(int num) {
		this.num=num;
	}
	
	public String CheckOddEven() {
		if(num%2==0) {
			return "The Given Number is EVEN.......!";
		}
		else {
			return "The Given Number is ODD.........!!!";
		}
	}
}
