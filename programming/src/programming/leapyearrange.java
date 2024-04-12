package programming;

import java.util.Scanner;

public class leapyearrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter start year");
		int start=s.nextInt();
		Scanner c=new Scanner(System.in);
		System.out.println("enter last year");
		int last=c.nextInt();
		System.out.println("leap year are");
		for(int i=start;i<=last;i++) {
			if(((i%4==0)&&(i%100!=0))||(i%400==0)){
				System.out.print(i+ " ");
			}
		}

	}

}
