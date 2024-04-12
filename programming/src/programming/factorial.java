package programming;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the number");
			int num=sc.nextInt();
			int fact=1;
			for(int i=1;i<=num;i++) {
				fact=fact*i;
			}
			System.out.println("factorial of a "+num+" is " +fact);
		}

	}

}
