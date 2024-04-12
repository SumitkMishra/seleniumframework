package Array;

import java.util.Scanner;

public class linearseachwithrepeatition {

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
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
		  for(int j=i+1;j<a.length;j++)
		  {
			  if(a[i]==a[j])
			  {
				  System.out.println("duplicate element in the array is "+a[i]);
				  flag=true;
			  }
		  }
		}
		if(flag==false)
		{
			System.out.println("duplicate element not found");
		}

	}

}

	


