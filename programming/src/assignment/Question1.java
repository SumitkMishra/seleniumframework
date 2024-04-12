package assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(25);
		al.add(54);
		al.add(36);
		al.add(96);
		System.out.println(al);
		int a[]=new int[al.size()];
		for(int i=0;i<al.size();i++) {
			a[i]=al.get(i);
		}
		for(int b:a) {
			System.out.print(b+ " ");
		}
		System.out.println();
		Iterator<Integer> lt=al.iterator();
		while(lt.hasNext()) {
			System.out.print(lt.next()+ " ");
		}

	}

}
