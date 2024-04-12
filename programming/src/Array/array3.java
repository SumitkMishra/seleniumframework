package Array;

import java.util.Scanner;

public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of an array");
		int size=sc.nextInt();
		int sum=0;
		int a[]=new int[size];
		System.out.println("enter the elements of array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
         int avg=sum/size;
         System.out.println("average of array " +avg);
	}

}
