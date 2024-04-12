package programming;

public class diamond1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=4;row++) {
			for(int space=4;space>=row;space--) {
				System.out.print(" ");
			}
			for(int star=1;star<(2*row);star++) {
				System.out.print("*");
			}
			System.out.println();
		}
for(int row=3;row>=1;row--) {
	for(int space=4;space>=row;space--) {
		System.out.print(" ");
	}
	for(int star=1;star<(2*row);star++) {
		System.out.print("*");
	}
	System.out.println();
}
	}

}
