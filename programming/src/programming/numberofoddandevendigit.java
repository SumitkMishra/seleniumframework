package programming;

import java.util.Scanner;

public class numberofoddandevendigit {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the number");
			int num=sc.nextInt();
			int oddcount=0;
			int evencount=0;
			while(num>0) { 
				int rem=num%10;
				if(rem%2==0) {
					evencount++;
				}
				else {
					oddcount++;
				}
				num=num/10;
			}
System.out.println("even digit is" +evencount);
System.out.println("odd digit count is" +oddcount);
		}
	}

}
