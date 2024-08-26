package basicprograms;

public class WAP_showing_Encapsulation_String_with_String {
	private String username= "contact@grotechminds.com";
	private String password= "Admin@123";

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static void main(String[] args) {
				
		WAP_showing_Encapsulation_String_with_String e1=new WAP_showing_Encapsulation_String_with_String();
		e1.setUsername("garima.lekhi@yahoo.com");
		System.out.println(e1.getUsername());
		e1.setPassword("Admin@2024");
		System.out.println(e1.getPassword());
	}

}
