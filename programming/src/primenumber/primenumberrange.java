package primenumber;

import java.util.Scanner;

public class primenumberrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the start number");
int start=sc.nextInt();
System.out.println("enter the end number");
int end=sc.nextInt();
System.out.println("range of prime number are");
for(int i=start;i<=end;i++) {
	int count=0;
	for(int j=2;j<start;j++) {
		if(i%j==0) {
			count++;
		}
	}
	
	if(count==0) {
		System.out.print(i+" ");
	}
	}
}
	}


