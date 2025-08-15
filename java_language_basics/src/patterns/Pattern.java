package patterns;

public class Pattern {
	public int row;
	public int col;
	
	public Pattern() {
		row=0;
		col=0;
	}
	
	public Pattern(int row,int col) {
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
	
	public void SolidSquare() {
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}

}
