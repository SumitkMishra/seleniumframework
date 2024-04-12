package programming;

public class Pattern {

	public static void main(String[] args) {
	 int n=4;
	 int num=2;
	 int temp=1;
	 for(int i=1;i<n;i++) {
		 int a=temp;
		 for(int j=1;j<=i;j++) {
			 
			 System.out.print(a-- +" ");
		 }
		 System.out.println();
		 temp=temp + num++;
	 }

	}

}
