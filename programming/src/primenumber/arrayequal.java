package primenumber;

import java.util.Arrays;
import java.util.Scanner;

public class arrayequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array 1");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the element of array1");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter the size of array 2");
		int wide=sc.nextInt();
		int b[]=new int[wide];
		System.out.println("enter the element of array2");
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			if(a.length!=b.length) {
				System.out.println("array is not equal");
			}
			
				}
		System.out.println("both array are equal "+Arrays.equals(a, b));
			}
		

	}


