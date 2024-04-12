package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question4 {

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
		Arrays.sort(a);
		System.out.println("enter the element to be search");
		int key=s.nextInt();
		int first=0;
		int last=a.length-1;
		Binarysearch(a,first,last,key);
	}
	public static void Binarysearch(int a[],int first,int last,int key) {
			int mid=(first+last)/2;
			while(first<=last) {
			if(a[mid]<key) {
				first=mid+1;
			}
			else if(a[mid]==key) {
				System.out.println("element is found at the index of "+mid);
				break;
			}
			else {
				last=mid-1;
			}
			mid=(first+last)/2;
	}
			if(first>last) {
				System.out.println("element not found");
			}

	}
}
