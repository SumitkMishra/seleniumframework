package string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="grab";
		String str2="brag";
		String str3=str1.toLowerCase();
		String str4=str2.toLowerCase();
		if(str4.length()!=str3.length()) {
			System.out.println("Not a Anagram");
		}
		else
		{
			char[] string1=str1.toCharArray();
			char[] string2=str2.toCharArray();
			Arrays.sort(string1);
			Arrays.sort(string2);
			if(Arrays.equals(string1, string2)==true) {
				System.out.println("It is a Anagram");
			}
			else
			{
				System.out.println("Not a Anagram");
			}
		}

	}

}
