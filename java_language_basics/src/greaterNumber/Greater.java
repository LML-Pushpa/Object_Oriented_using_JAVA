package greaterNumber;

public class Greater {
	public int num1;
	public int num2;
	public int num3;
	
	public Greater() {
		num1=0;
		num2=0;
		num3=0;
	}
	
	public Greater(int num1,int num2,int num3) {
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
	}
	
	public int WhichGreater() {
		if(num1 > num2 && num1 > num3) {
			return num1;
		}
		else if(num2 > num3 && num2 > num1) {
			return num2;
		}
		else if(num3 > num1 && num3 > num2) {
			return num3;
		}
		return 0;
	}
}
