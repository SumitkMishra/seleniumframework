package Array;

import java.util.Scanner;

public class joggedarray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of row");
		int row=sc.nextInt();
		int[][] a=new int[row][];
		System.out.println("enter the number of column");
		for(int i=0;i<row;i++) {
			a[i]=new int[sc.nextInt()];
		}
		System.out.println("enter the element of array");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
