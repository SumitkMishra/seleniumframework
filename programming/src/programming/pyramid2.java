package programming;

public class pyramid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   for(int row=1;row<=5;row++) {
	   for(int space=5;space>=row;space--) {
		   System.out.print(" ");
	   }
	   for(int star=1;star<=row;star++) {
		   System.out.print(" *");
	   }
	   System.out.println();
   }
	}

}
