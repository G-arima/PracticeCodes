package basicprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapInterface8 {
	
	public static void main(String[] args) {
		Map<String,Double> m1=new HashMap<String,Double>();
		m1.put("Aashna", 50000.50);
		m1.put("Aishwarya", 100000.11);
		m1.put("Sujata", 78000.79);
		m1.put("Sneha", 98777.70);
		m1.put("Prajakta", 220008.88);
		System.out.println(m1);
		System.out.println("*********************************");
		for(String s1:m1.keySet()) {
			System.out.println(s1);
		}
		System.out.println("---------------------------------");
		for(Double d1 : m1.values())
		{
			System.out.println(d1);
		}
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		for(Entry<String, Double> e1 :m1.entrySet())
		{
		System.out.println("The value of Employee Name and Employee Salary is : " +e1);	
		}
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Iterator<Entry<String,Double>> i1=m1.entrySet().iterator();
		while(i1.hasNext()==true)
		{
			System.out.println(i1.next());
		}
	}

}
