package basicprograms;

import java.util.HashMap;
import java.util.Map;

public class MapInterface4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("Mohan", 93);
		m1.put("Sham", 82);
		m1.put("HariPrasad", 90);
		m1.put("Vinod", 87);
		System.out.println(m1);

		m1.remove("Vinod");
		System.out.println(m1);
		m1.remove("HariPrasad", 90);
		System.out.println(m1);
		m1.remove("Sham", 82);
		System.out.println(m1);

		m1.replace("Sham", 85);
		System.out.println(m1);
		m1.replace("Vinod", 87, 89);
		System.out.println(m1);
		m1.remove("Mohan");
		System.out.println(m1);

		Map<String, Integer> m2 = new HashMap<String, Integer>();
		m1.put("Priya", 88);
		m1.put("Ankita", 62);
		m1.put("Twinkle", 70);
		m1.put("Harry", 100);
		m2.clear();
		System.out.println(m2);

	}

}
