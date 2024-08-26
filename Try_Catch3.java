package basicprograms;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch3 {

	public static void main(String[] args) {

		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("The size of the Roll Number array is"); try { int
		 * rollno[] = new int[sc.nextInt()]; } catch (InputMismatchException a1) {
		 * System.out.
		 * println("Please read the question carefully and enter properly the size of roll number"
		 * ); Scanner s1 = new Scanner(System.in); int rollno[] = new int[s1.nextInt()];
		 * rollno[0] = 85; rollno[1] = 96; rollno[2] = 55; try { rollno[3] = 10; } catch
		 * (ArrayIndexOutOfBoundsException a2) {
		 * System.out.println(Arrays.toString(rollno)); } }
		 */
		/*
		*/

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter roll number size:");
			int rollNoSize = sc.nextInt();
			int rollno[] = new int[rollNoSize];
			rollno[0] = 85;
			rollno[1] = 96;
			rollno[2] = 55;
			rollno[3] = 10;
		} catch (InputMismatchException a1) {
			System.out.println("Please read the question carefully and enter properly the size of roll number");

		} catch (ArrayIndexOutOfBoundsException a2) {
			System.out.println("More numbers added than the size");
		}

	}

}
