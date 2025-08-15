package patterns;

public class RightAngle {
	public int row;
	public int col;
	
	public RightAngle() {
		row=0;
		col=0;
	}
	
	public RightAngle(int row,int col) {
		this.row=row;
		this.col=col;
	}
	
	public void RightAngleTriangle() {
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
