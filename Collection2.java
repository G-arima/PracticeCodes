package basicprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c1=new ArrayList();
		c1.add("Garima");
		c1.add(76);
		c1.add(76.76);
		c1.add(false);
		c1.add('M');
		System.out.println(c1);
		
		System.out.println(c1.size());
		boolean b1=c1.contains("Lekhi Mahindru");
		System.out.println(b1);
		Iterator it=c1.iterator();
		while(it.hasNext()==true)
		{
			System.out.println(it.next());
		}
	}
	       

}
