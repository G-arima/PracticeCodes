package basicprograms;

import java.util.HashMap;
import java.util.Map;

public class MapInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Double> m2=new HashMap<String,Double>();
		m2.put("Rice", 5.5);
		m2.put("Oil", 2.5);
		m2.put("Salt", 3.0);
		m2.put("Wheat", 10.10);
		System.out.println(m2);
		boolean b1=m2.containsKey("Oil");
		System.out.println(b1);
		boolean b2=m2.containsValue(1.1);
		System.out.println(b2);
		Map<String,Double> m3=new HashMap<String,Double>();
		m3.putAll(m2);
		m3.put("Pulses", 1.35);
		System.out.println(m3);
		boolean b3=m3.equals(m2);
		System.out.println(b3);
		if(m2.size()==m3.size()) {
			System.out.println("Size is equal");
		}
		else {
			System.out.println("Size is not equal");
		}
		}

}
