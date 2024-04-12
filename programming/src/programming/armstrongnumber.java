package programming;

import java.util.Scanner;

public class armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sum=0;int temp=num,count=0;
		while(num!=0) {
			count++;
			num=num/10;
		}
		num=temp;
		while(num!=0) {
			int rem=num%10;
			int powerof=1;
			for(int i=1;i<=count;i++) {
				powerof=powerof*rem;
			}
			sum=sum+powerof;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("it is a armstrong number");
		} 
		else
		{System.out.println("it is not a armstrong number");
		
		}

	}

}
