package basicprograms;

public class String_Functions_Problems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Manish";
		System.out.println(s.replace("M", "Z"));//Zanish
		String s1="Manish Kumar Tiwari";
		
		System.out.println(s1.replace(" ", ""));//ManishKumarTiwari
		String a="Avinash Yadav";
		System.out.println(a.replaceAll("[A-Z]", ""));//vinash adav
		System.out.println(s1.replaceAll("[a-z]", ""));//MKT
		String b="KV Number 1";
		System.out.println(b.replaceAll("[0-9]", ""));//KV Number
		String s2="Utkarsha";
		boolean ans=s2.endsWith("a");
		System.out.println(ans);//true
		String s3="";
		boolean ans1=s3.isEmpty();
		System.out.println(ans1);//true
		
		
		

	}

}
