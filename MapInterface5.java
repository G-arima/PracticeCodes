package basicprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("Mohan", 93);
		m1.put("Sham", 82);
		m1.put("HariPrasad", 90);
		m1.put("Vinod", 87);
		Set<String> s1 = m1.keySet();
		System.out.println(s1);
		System.out.println("***************************************");
		for (String s2 : m1.keySet()) {
			System.out.println(s2);
		}

		for (Integer i1 : m1.values()) {
			System.out.println(i1);
		}
		System.out.println("****************************************");
		for (Entry<String, Integer> e1 : m1.entrySet()) {
			System.out.println(e1);
		}
		System.out.println("*************************************************");
		Iterator<Entry<String, Integer>> i3 = m1.entrySet().iterator();
		while (i3.hasNext() == true) {
			System.out.println(i3.next());
		}

	}

}
