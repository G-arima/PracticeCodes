package basicprograms;

public class IfCondition_Program {
	static int age;
	public static void main(String[] args) {
		age=20;
		try {
			if(age>=18)
			{
			System.out.println("You can go and vote");	
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
