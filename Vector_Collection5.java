package basicprograms;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Collection5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1 = new Vector();
		v1.add("Garima");
		v1.addElement(30);
		System.out.println(v1.firstElement());
		v1.add("Lekhi");
		v1.add("Mahindru");
		v1.add(1);
		v1.add(132);
		v1.add(132132);
		v1.add(132132134);
		v1.add(true);
		v1.add('M');
		v1.add(12.12);
		v1.add(122.122);
		v1.add(null);
		v1.add(null);
		v1.add(null);
		v1.add(null);
		v1.add("Garima");
		v1.add("Lekhi");
		v1.add("Mahindru");
		v1.add(1);
		v1.add(132);
		v1.add(132132);
		v1.add(132132134);
		v1.add(true);
		v1.add('M');
		v1.add(12.12);
		v1.add(122.122);
		v1.add(null);
		v1.add(null);
		v1.add(null);
		v1.add(null);
		// System.out.println(v1);

		Iterator it = v1.iterator();
		while (it.hasNext() == true) {
			System.out.println(it.next());
		}
		System.out.println("###########################################");
		ListIterator al = v1.listIterator();
		while (al.hasNext() == true) {
			System.out.println(al.next());
		}
		System.out.println("*******************************************");

		Enumeration e = v1.elements();
		while (e.hasMoreElements() == true) {
			System.out.println(e.nextElement());
		}

	}

}
