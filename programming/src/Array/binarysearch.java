package Array;

import java.util.Arrays;
import java.util.Scanner;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int length=s.nextInt();
		int a[]=new int[length];
		System.out.println("enter the element of an array");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("enter the element to be found");
		int key=s.nextInt();
		Arrays.sort(a);
		int first=0;
		int last=a.length-1;
		binarysearch1(a,first,last,key);
	}
		public static void binarysearch1(int a[],int first,int last,int key)
		{ int mid=first+last/2;
		 while(first<=last)
		{ if(a[mid]<key)
		{
			first=mid+1;
		}
		else {
			if(a[mid]==key) {
				System.out.println("element is found at index "+mid);
				break;
			}
			else {
				last=mid-1;
			}
		}
			mid=(first+last)/2;
		}
		
		if(first>last)
		{
			System.out.println("element is not found");
		}
		}
		

	}


