package basicprograms;

public class StringBuffer_Problem9 {
public static void main(String[] args) {
	StringBuffer s1=new StringBuffer("Garima Lekhi Mahindru");
	String a=s1.substring(7);
	System.out.println(a);
	String b=s1.substring(0, 6);
	System.out.println(b);
	char c=s1.charAt(1);
	System.out.println(c);
}
}
