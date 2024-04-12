package string;

import java.util.Scanner;

public class numberofcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		int len=s.length();
		int count=0;
		for(int i=0;i<len;i++) {
			if(s.charAt(i)!=' ') {
			count++;
			}
		}
		System.out.println("number of character in a string "+count);

	}

}
