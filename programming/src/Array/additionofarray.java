package Array;

import java.util.Scanner;

public class additionofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of row of array 1");
		int row=sc.nextInt();
		System.out.println("enter the number of column of aray 1");
		int column=sc.nextInt();
		int a[][]=new int[row][column];
		System.out.print("enter the element for array 1"+" ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the number of column of array 2");
		int row1=sc.nextInt();
		System.out.println("enter the number of column of array 2");
		int column1=sc.nextInt();
		int b[][]=new int[row1][column1];
		System.out.print("enter the element of array 2"+" ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		int c[][]=new int[row][column];
		System.out.println("result of element are");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
