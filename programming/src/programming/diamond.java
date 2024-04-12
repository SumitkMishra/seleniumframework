package programming;

public class diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=4;i++) {
	for(int j=4;j>=i;j--) {
		System.out.print(" ");
	}
	for(int k=1;k<=i;k++) {
		System.out.print(" *");
	}
	System.out.println();
}
for(int i=3;i>=1;i--) {
	for(int j=4;j>=i;j--) {
		System.out.print(" ");
	}
	for(int k=1;k<=i;k++) {
		System.out.print(" *");
	}
	System.out.println();
}
	}

}
