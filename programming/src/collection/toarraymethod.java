package collection;

import java.util.ArrayList;

public class toarraymethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> st=new ArrayList<String>();
		st.add("sumit");
		st.add("somya");
		st.add("papa");
		st.add("maa");
		String[] str=st.toArray( new String[st.size()]);
		for(String s:str) {
			System.out.print(s+ " ");
		}

	}

}
