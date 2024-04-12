package collection;

import java.util.ArrayList;

public class arraylisttoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(30);
		al.add(20);
		al.add(25);
		System.out.println(al);
		System.out.println(al.size());
		int a[]=new int[al.size()];
		for(int i=0;i<al.size();i++) {
			a[i]=al.get(i);
		}
		for(int b:a) {
			System.out.print(b+ " ");
		}

	}

}
