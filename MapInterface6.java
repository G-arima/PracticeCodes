package basicprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapInterface6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Double> m1=new HashMap<Integer,Double>();
		m1.put(76104, 50698.98);
		m1.put(76110, 60666.66);
		m1.put(76115, 88908.77);
		m1.put(78119, 77809.94);
		m1.put(78909, 99912.10);
		//System.out.println(m1);
		for(Integer i1 : m1.keySet())
		{
			System.out.println("Employee Id :" +i1);
		}
		System.out.println("----------------------------------------");
		for(Double d1 : m1.values())
		{
			System.out.println("Employee Salary :" +d1);
		}
		System.out.println("*******************************************");
		for(Entry<Integer, Double> e1: m1.entrySet())
		{
			System.out.println("Employee Id and Salary are : " +e1);
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
Iterator<Entry<Integer, Double>> i2=m1.entrySet().iterator();
while(i2.hasNext()==true)
{
	System.out.println("The value of Employee Id and salary is : " +i2.next());
}

	}

}
