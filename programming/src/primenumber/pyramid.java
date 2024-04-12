package primenumber;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) {
			for(int space=6;space>=i;space--) {
				System.out.print(" ");
			}
			for(int star=1;star<2*i;star++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
