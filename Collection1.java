package basicprograms;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c1=new ArrayList();
		c1.add("Garima");
		c1.add(76);
		c1.add(76.76);
		c1.add(false);
		c1.add('M');
		c1.add("Garima");
		c1.add(null);
		c1.add(null);
		c1.add(null);
		c1.add("Abhi");
		c1.add(2);
		c1.add(134);
		c1.add(134.134444);
		c1.add(true);
		System.out.println(c1);
		
	}
}
/*		for(int i=0;i<c1.size();i++)
		{
				
		}
		System.out.println(c1);
	}
}*/
		
		/*Collection c2=new ArrayList();
		c2.addAll(c1);
		c2.add("Wheat");
		c2.add("tea");
		c2.add("coffee");
		c2.add("Rice");
		c2.add("Sugar");
		System.out.println(c2);
		boolean b=c2.equals(c1);
		System.out.println(b);
		boolean b1=c2.isEmpty();
		System.out.println(b1);
		boolean b2=c2.containsAll(c1);
		System.out.println(b2);
		
		 * c1.clear(); 
		 * System.out.println(c1);
		 
		c1.remove(76);
		System.out.println(c1);
		
		c2.removeAll(c1);
		System.out.println(c2);

	}

}
*/