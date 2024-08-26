package basicprograms;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue_Collection8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue q1 = new PriorityQueue();
		/*
		 * q1.add("Shefali"); q1.add("Mahindru"); q1.add("Sood"); q1.add("Wife of");
		 * q1.add("Vaibhav"); q1.add("Sood");
		 */
		// q1.add(true);
		// q1.add(false);
		/*
		 * q1.add('M'); q1.add('K'); q1.add('T');
		 */

		q1.add(1);
		q1.add(22);
		q1.add(222222222);
		q1.add(123);
		q1.add(10);
		q1.add(20);
		q1.add(10);
		q1.add(20);
		q1.add(10);
		q1.add(20);
		q1.add(1);
		q1.add(22);
		q1.add(222222222);
		q1.add(123);
		q1.add(10);
		q1.add(20);
		q1.add(10);
		q1.add(20);
		q1.add(10);
		q1.add(20);
		Iterator it=q1.iterator();
		while(it.hasNext()==true)
		{
			System.out.println(it.next());
		}

		/*
		 * q1.add(null); //q1.add(76.76); q1.add(null); q1.add(null); q1.add(null);
		 * q1.add(null); q1.add(null); q1.add(null); q1.add(null); q1.add(null);
		 */
		//System.out.println(q1);

	}

}
