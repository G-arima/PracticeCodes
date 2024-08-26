package basicprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Collection4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();

		al.add("Garima");
		al.add("Shubhu");
		al.add("Abhinav");
		al.add("Meenu");
		al.add("Rajesh");
		al.add("Sarita");
		al.add("Shakti");
		al.add('A');
		al.add('M');
		al.add(10);
		al.add(100);
		al.add(1);
		al.add(76.76);
		al.add(2);
		al.add(2.3);
		/*
		 * Collections.sort(al); System.out.println(al);
		 */

		al.add(false);
		al.add("Garima");
		al.add("Shubhu");
		al.add("Abhinav");
		al.add("Meenu");
		al.add("Rajesh");
		al.add("Sarita");
		al.add("Shakti");
		al.add('A');
		al.add('M');
		al.add(10);
		al.add(100);
		al.add(1);
		al.add(76.76);
		al.add(2);
		al.add(2.3);
		al.add(false);
		al.add(null);
		al.add(null);
		al.add(null);
		al.add(null);
		al.add(null);
		al.add(null);
		

		/*
		 * Iterator it = al.iterator(); while (it.hasNext() == true) {
		 * System.out.println(it.next()); }
		 */

		// Next Use List of Iterator
       ListIterator i2=al.listIterator();
       while(i2.hasNext()==true)
       {
    	   System.out.println(i2.next());
       }
	}

}
