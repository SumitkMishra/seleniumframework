package string;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("reverse string is "+rev);
		if(str.equals(rev)) {
			System.out.println("String is pallindrom");
		}
		else
		{
			System.out.println("String is not a pallindrom");
		}

	}

}
