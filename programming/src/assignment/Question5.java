package assignment;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("enter the element of an array");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("odd and even element are");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println("even element is "+a[i]);
			}
			else {
				System.out.println("odd element is "+a[i]);
			}
		}

	}

}
