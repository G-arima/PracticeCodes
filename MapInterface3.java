package basicprograms;

import java.util.HashMap;
import java.util.Map;

public class MapInterface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Double> m3=new HashMap<String,Double>();
		m3.put("Rice", 5.5);
		m3.put("Oil", 2.5);
		m3.put("Salt", 3.0);
		m3.put("Wheat", 10.10);
		System.out.println(m3);
		m3.clear();
		System.out.println(m3);
		boolean b1=m3.isEmpty();
		System.out.println(b1);
	}

}
