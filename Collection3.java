package basicprograms;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s1=new HashSet();
		s1.add(10);
		s1.add(90);
		s1.add(45);
		s1.add(13);
		s1.add(12);
		s1.add(13);
		s1.add(76.7676);
		s1.add(null);
		s1.add(null);
		s1.add(null);
		s1.add(null);
		s1.add(10);
		s1.add(90);
		s1.add(45);
		s1.add(13);
		s1.add(12);
		s1.add(13);
		s1.add(76.7676);
		s1.add(null);
		s1.add(null);
		s1.add(null);
		s1.add(null);
		s1.add(10);
		s1.add(90);
		s1.add(45);
		s1.add(13);
		s1.add(12);
		s1.add(13);
		s1.add(76.7676);
		s1.add(null);
		s1.add(null);
		s1.add(null);
		s1.add(null);
		s1.add("Garima");
		//Collections.sort(s1);
		
		System.out.println(s1);
		
		Set<Integer> s2=new TreeSet<>();
		s2.add(10);
		s2.add(90);
		s2.add(45);
		s2.add(13);
		s2.add(12);
		s2.add(1);
		s2.add(13);
		System.out.println(s2);
		Iterator it=s1.iterator();
		while(it.hasNext()==true)
		{
			System.out.println(it.next());
		}
		
		
		/*
		 * s1.add(132132); s1.add(true); s1.add(67.76); s1.add(989.897);
		 */
		/*
		 * s1.add('c'); s1.add("Rice"); s1.add("Sugar"); s1.add("milk");
		 * s1.add("Kesar"); s1.add(null); s1.add(null); s1.add(null); s1.add(null);
		 * s1.add(null);
		 */
		/*
		 * s1.add(132); s1.add(132132);
		 */
		
		

	}

}
