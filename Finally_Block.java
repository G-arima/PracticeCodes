package basicprograms;

public class Finally_Block {

	public static void main(String[] args) {
		
		
	     int a[]=new int[5];
	     a[0]=20;
	     a[1]=21;
	     a[2]=22;
	     a[3]=23;
	     try {
	     a[4]=24;
	     }
			
			  catch(ArrayIndexOutOfBoundsException a1) 
	     {
			  System.out.println("The Exception is Handled"); 
			  }
			 
	     finally
	     {
	    	System.out.println("Anything in this Block with surely execute"); 
	     }

	}

}
