package collection;

import java.util.HashSet;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashset=new HashSet<String>();
		hashset.add("papa");
		hashset.add("mom");
		hashset.add("Soumya");
		hashset.add("sumit");
		System.out.println("Hashset contains");
		for(String s:hashset) {
			System.out.print(s+ " ");
		}

	}

}
