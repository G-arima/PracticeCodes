package basicprograms;

public class Array_Average {

	public static void main(String[] args) {
		int a[]=new int[4];
		a[0]=17;
		a[1]=35;
		a[2]=81;
		a[3]=42;
		double sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("The average value of the Array is :->" +sum/4);

	}

}
