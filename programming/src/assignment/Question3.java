package assignment;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the sentence");
		String str=s.nextLine();
		System.out.println(str);
		str=str.replaceAll("\\s+","");
		System.out.println("string after removing space "+str);
				
		

	}

}
