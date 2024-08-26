package basicprograms;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Stack_Collection7 {

	public static void main(String[] args) {
		Stack s1=new Stack();
		s1.add("Manish");
		s1.add("Kumar");
		s1.add("Tiwari");
		s1.add(1);
		s1.add(12);
		s1.add(154);
		s1.add(10990866);
		s1.add(true);
		s1.add(false);
		s1.add('M');
		s1.add('k');
		s1.add('t');
		s1.add(null);
		s1.add(null);
		s1.add(null);
		s1.add(null);
		/*
		 * s1.add("Manish"); s1.add("Kumar"); s1.add("Tiwari"); s1.add("Manish");
		 * s1.add("Kumar"); s1.add("Tiwari"); s1.add(1); s1.add(12); s1.add(154);
		 * s1.add(10990866); s1.add(true); s1.add(false); s1.add('M'); s1.add('k');
		 * s1.add('t'); s1.add(null); s1.add(null); s1.add(null); s1.add(null);
		 */
		s1.add("Manish");
		s1.push("Abhishek");
		//System.out.println(s1);
		Iterator it=s1.iterator();
		while(it.hasNext()==true)
		{
			System.out.println(it.next());
		}
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		ListIterator al=s1.listIterator();
		while(al.hasNext()==true)
		{
			System.out.println(al.next());
		}
		
		

	}

}
