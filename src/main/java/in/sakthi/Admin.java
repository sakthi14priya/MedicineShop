package in.sakthi;

public class Admin {
	public static String name(String name) {

		// admin page
		if (name.equals("customer")) {
			System.out.println("You are a Admin...");
			System.out.println("So you are add the Medicines...");
		} else {
			// customer page
			System.out.println("You are a Customer...");
			System.out.println("You purchase the Medicine...");
		}
		return name;
	}
}