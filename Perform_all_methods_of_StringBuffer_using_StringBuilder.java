package basicprograms;

public class Perform_all_methods_of_StringBuffer_using_StringBuilder {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder("garima lekhi");
	sb.append(" mahindru");
	System.out.println(sb);
	sb.delete(7, 12);
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);
	StringBuilder sb2=new StringBuilder("Hello");
	sb2.insert(5, " Beautiful");
	System.out.println(sb2);
	sb2.replace(6, 15, "World");
	System.out.println(sb2);
	int a=sb2.capacity();
	System.out.println(a);
	char b=sb2.charAt(4);
	System.out.println(b);
	int c=sb2.length();
	System.out.println(c);
	String d=sb2.substring(5);
	System.out.println(d);
	String e=sb2.substring(7, 10);
	System.out.println(e);
	
}
}
