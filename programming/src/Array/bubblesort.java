package Array;

import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int length=s.nextInt();
		int a[]=new int[length];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("after bubble sort ");
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}

	}

}
