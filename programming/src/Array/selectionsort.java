package Array;

import java.util.Scanner;

public class selectionsort {

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
		System.out.println("before the selection sort");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		int min;
		for(int i=0;i<a.length;i++) {
			 min=i;
			for(int j = i+1;j<a.length;j++) {
               if(a[j]<a[min]) {
            	   min=j;
               }
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		System.out.println("after selection sort");
        for(int i=0;i<a.length;i++) {
        	System.out.print(a[i]+ " ");
        }
	}

}
