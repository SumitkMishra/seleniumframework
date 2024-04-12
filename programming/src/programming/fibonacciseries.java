package programming;

import java.util.Scanner;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value");
		int num=s.nextInt();
		System.out.println("fibonacci series");
		int a=0;int b = 0;int c = 1;
		for(int i=1;i<=num;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(+a+ " ");
			
		}

	}

}
