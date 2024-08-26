package basicprograms;

public class WAP_to_showcase_all_the_methods_of_StringBuffer {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("Hello");
	sb.append(" World");
	System.out.println(sb);
	sb.insert(5, "Beautiful");
	System.out.println(sb);
	sb.replace(5, 10, "Wonder");
	System.out.println(sb);
	sb.delete(5, 15);
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);
	StringBuffer sb1=new StringBuffer("Garima");
	int a=sb1.capacity();
	System.out.println(a);
	sb1.ensureCapacity(a);
	System.out.println(sb1);
	char c=sb1.charAt(2);
	System.out.println(c);
	int d=sb1.length();
	System.out.println(d);
	String e=sb1.substring(1);
	System.out.println(e);
	String f=sb1.substring(1, 4);
	System.out.println(f);
	
	
}
}
