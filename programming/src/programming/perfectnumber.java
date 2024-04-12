package programming;

import java.util.Scanner;

public class perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
			sum=sum+i;
		}
		}
		if(num==sum) {
			System.out.println("it is a perfect number");
		}
		else {
			System.out.println("not a perfect number");
		}

	}

}
