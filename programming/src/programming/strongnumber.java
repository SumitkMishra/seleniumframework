package programming;

import java.util.Scanner;

public class strongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sum=0,temp=num;
		while(num!=0) {
			int rem=num%10;
			int fact=1;
			for(int i=1;i<=rem;i++) 	{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("it is a strong number");
		}
		else
		{
			System.out.println("it is not a strong number");
		}
		

	}

}
