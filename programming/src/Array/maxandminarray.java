package Array;

import java.util.Scanner;

public class maxandminarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("enter the element of array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("maximum number is "+max);
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("minimum number is "+min);

	}

}
