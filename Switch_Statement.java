package basicprograms;

import java.util.Scanner;

public class Switch_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please press 1 for chrome");
		System.out.println("Please press 2 for Firefox");
		System.out.println("Please press 3 for Edge");
		int browserselection=sc.nextInt();
		
		switch(browserselection)
		{
		case 1: System.out.println("Launch Chrome browser");
		        break;
		case 2: System.out.println("Launch Firefox browser");
		        break;
		case 3: System.out.println("Launch Edge browser");
		        break;
		default : 
		System.out.println("Hey!!!! Sorry your browser choice is incorrect");
		}

	}

}
