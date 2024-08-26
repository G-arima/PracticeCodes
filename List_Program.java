package basicprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1=new ArrayList();
		/*
		 * l1.add("Garima"); l1.add("Abhinav");
		 */
		l1.add(76);
		/*
		 * l1.add(76.76); l1.add(76.767); l1.add(76.767676);
		 */
		l1.add(0);
		l1.add(10);
		/*
		 * l1.add(false); l1.add('k'); l1.add(null); l1.add(null); l1.add(null);
		 * l1.add(null); l1.add('k'); l1.add("Garima"); l1.add("Abhinav");
		 */
		//System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
		Iterator it=l1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		ListIterator it1=l1.listIterator();
		System.out.println("Forward iteration using list iterator");
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		System.out.println("Backward iteration using list iterator");
		while(it1.hasPrevious())
		{
			System.out.println(it1.previous());
		}
		

	}

}
