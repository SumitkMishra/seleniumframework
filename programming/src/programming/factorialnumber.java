package programming;

import java.util.Scanner;

public class factorialnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the start number");
int start=sc.nextInt();
System.out.println("enter end number");
int end=sc.nextInt();
for(int i=start;i<=end;i++) {
	long fact=1;
	for(int j=1;j<=i;j++) {
		fact=fact*j;
	}
	System.out.println("factorial of"+i+"is"+fact);
}
	}

}
