package basicprograms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Collection;
public class Linkedlist_Collection6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1=new LinkedList();
		l1.add("Richa");
		l1.add("Loomba");
		l1.add("Kapoor");
		l1.add("Mahima");
		l1.add("Dahiya");
		l1.add(1);
		l1.add(132);
		l1.add(1);
		l1.add(132);
		l1.add(132132);
		l1.add(132132134);
		l1.add(true);
		l1.add('M');
		l1.add(12.12);
		l1.add(122.122);
		l1.add(null);
		l1.add(null);
		l1.add(null);
		l1.add(null);
		/*
		 * l1.add("Richa"); l1.add("Loomba"); l1.add("Kapoor"); l1.add("Mahima");
		 * l1.add("Dahiya"); l1.add(1); l1.add(132); l1.add(1); l1.add(132);
		 * l1.add(132132); l1.add(132132134); l1.add(true); l1.add('M'); l1.add(12.12);
		 * l1.add(122.122); l1.add(null); l1.add(null); l1.add(null); l1.add(null);
		 */
		Object a=l1.getFirst();
		System.out.println(a);
		Object b=l1.getLast();
		System.out.println(b);
		Object c=l1.removeFirst();
		System.out.println(c);
		Object d=l1.removeLast();
		System.out.println(d);
		System.out.println("&&&&&&&&&&&&&&&&&");
		System.out.println(l1);
		/*
		 * Iterator it=l1.iterator();
		 * 
		 * while(it.hasNext()==true) { System.out.println(it.next()); }
		 * System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		 * ListIterator al=l1.listIterator(); while(al.hasNext()==true) {
		 * System.out.println(al.next()); }
		 */

	}

}
