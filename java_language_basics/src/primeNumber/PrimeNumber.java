package primeNumber;

public class PrimeNumber {
	public int num;
	
	public PrimeNumber() {
		num=0;
	}
	
	public PrimeNumber(int num) {
		this.num=num;
	}
	
	public String isPrime() {
		if(num<=1) {
			return "The Given Number is Not Prime";
		}
		else {
			for(int i=2;i*i<=num;i++) {
				if(num%i==0) {
					return "The Given Number is not Prime";
				}
			}
		}
		return "The Given Number is Prime";
	}
}
