package programming;

public class pyramid {

	public static void main(String[] args) {
		int n=5;
		for(int row=1;row<=n;row++) {
			for(int space=1;space<=n-row;space++) {
				System.out.print("  ");
			}
			for(int col=1;2*row>col;col++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		for(int row=n-1;row>=1;row--) {
			for(int space=1;space<=n-row;space++) {
				System.out.print("  ");
			}
			for(int col=1;2*row>col;col++) {
				System.out.print("# ");
			}
			System.out.println();
		}

	}
	

}
