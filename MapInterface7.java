package basicprograms;

import java.util.HashMap;
import java.util.Map;

public class MapInterface7 {
public static void main(String[] args) {
	Map<Integer,Double> m1=new HashMap<Integer,Double>();
	m1.put(76104, 50698.98);
	m1.put(76110, 60666.66);
	m1.put(76115, 88908.77);
	m1.put(78119, 77809.94);
	m1.put(78909, 99912.10);
	m1.putIfAbsent(76220, 100000.90);
	System.out.println(m1);
	m1.get(76220);
	System.out.println(m1);
	
}
}
