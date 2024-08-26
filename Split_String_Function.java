package basicprograms;

import java.util.Arrays;

public class Split_String_Function {

	public static void main(String[] args) {
		String s="Manish Kumar Tiwari";
		String name[]=s.split(" ");
		System.out.println(Arrays.toString(name));//Manish,Kumar,Tiwari
		String name1[]=s.split(" ", 2);
		System.out.println(Arrays.toString(name1));//Manish, Kumar Tiwari
		String name2[]=s.split(" ", 3);//Manish,Kumar,Tiwari
		System.out.println(Arrays.toString(name2));
		String name3[]=s.split(" ", 1);//Manish Kumar Tiwari
		System.out.println(Arrays.toString(name3));

	}

}
