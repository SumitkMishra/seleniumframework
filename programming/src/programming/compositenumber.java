package programming;

import java.util.Scanner;

public class compositenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int count=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count>1) {
			System.out.println("it is a composite number");
		}
		else {
			System.out.println("it is not a composite number");
		}

	}

}
