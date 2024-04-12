package Array;

import java.util.Scanner;

public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int lenght=s.nextInt();
		int a[]=new int[lenght];
		System.out.println("enter the element of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter the element to be search");
		int key=s.nextInt();
		int flag= linearsearch(a,key);
		if(flag==-1)
		{
			System.out.println("element is not found in the array");
		}
		else
		
			System.out.println(key+" element is found at the index  "+flag);
		}
		
		public static int linearsearch(int a[],int key)
		{
			for( int i=0;i<a.length;i++)
			{
				if(a[i]==key)
				{
					return i;
				}
			}
			return -1;
		}
		


	}


