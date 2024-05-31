package libraryManagementSystem;

public class Admin {
	private static int id = 5006;
	private static String Name = "LMS";
	private static String pass = "aaBBcc";
	
	
	public static boolean authentication(int id1, String pass1) {
		// TODO Auto-generated method stub
		return (id == id1 && pass.equals(pass1));

	}
	
}
