package basicprograms;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_Collection10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet ls=new LinkedHashSet();
		ls.add(true);
		ls.add("Garima");
		ls.add("Lekhi");
		ls.add("Mahindru");
		ls.add("W/O");
		ls.add("Shubham");
		ls.add("Mahindru");
		ls.add(null);
		ls.add(null);
		ls.add(null);
		ls.add(null);
		ls.add(null);
		ls.add(20);
		ls.add(2232);
		ls.add(22.32);
		ls.add(true);
		ls.add(false);
		ls.add('M');
		ls.add('K');
		ls.add('T');
		ls.add(33.3333);
		ls.add("Garima");
		ls.add("Lekhi");
		//System.out.println(ls);
		Iterator it=ls.iterator();
		while(it.hasNext()==true)
		{
			System.out.println(it.next());
		}
		

	}

}
