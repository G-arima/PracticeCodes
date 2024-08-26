package basicprograms;

public class String_Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String s="MANISH KUMAR TIWARI"; System.out.println(s.length());//19
		 * System.out.println(s.trim());//MANISH KUMAR TIWARI
		 * System.out.println(s.toLowerCase());//manish kumar tiwari
		 * System.out.println(s.toUpperCase());//MANISH KUMAR TIWARI
		 * System.out.println(s.charAt(6));// space System.out.println(s.indexOf(s));//4
		 * System.out.println(s.substring(0, 6));//manish
		 * System.out.println(s.substring(7, 12));//kumar
		 * System.out.println(s.substring(13));//tiwari
		 */		
		String s1="Garima Lekhi Mahindru";
		System.out.println(s1.length());
		System.out.println(s1.trim());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.charAt(7));
		System.out.println(s1.indexOf('M'));
		System.out.println(s1.substring(0, 6));
		System.out.println(s1.substring(7, 12));
		System.out.println(s1.substring(13));
		

	}

}
