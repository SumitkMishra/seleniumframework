package Array;

import java.util.Scanner;

public class factorialoflastdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int length=sc.nextInt();
		int a[]=new int[length];
		System.out.println("enter the element");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
for(int i=0;i<a.length;i++) {
	int lastdigit=a[i]%10;
	int fact= fact(lastdigit);
	System.out.println("last digit factorial is "+a[i]+" is "+fact);
}
	}
public static int fact(int lastdigit) {
	int fact=1;
	for(int i=1;i<=lastdigit;i++) {
		fact=fact*i;
	}
		return fact;
	

	}

}
