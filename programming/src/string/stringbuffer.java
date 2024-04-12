package string;

public class stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str=new StringBuffer("good morning");
		String s=new String(str);
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(str.reverse());

	}

}
