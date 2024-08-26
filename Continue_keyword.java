package basicprograms;

public class Continue_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //the purpose of Continue Keyword is to skip the particular iteration
		for(int i=0;i<=5;i++)
		{
			if(i==4)
			{
				continue;
			}
			System.out.println(i);
		}
	}

}
