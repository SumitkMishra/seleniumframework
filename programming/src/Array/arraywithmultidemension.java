package Array;

import java.util.Scanner;

public class arraywithmultidemension {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); {
			System.out.println("enter the row of array");
			int row=sc.nextInt();
			System.out.println("enter columns of array");
			int columns=sc.nextInt();
			int a[][]=new int[row][columns];
			System.out.println("enter the elements");
			for(int i=0;i<row;i++) {
				for(int j=0;j<columns;j++) {
					a[i][j]=sc.nextInt();
				}
			}
			for(int[] i:a) {
				for(int j:i) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}

	}

}
