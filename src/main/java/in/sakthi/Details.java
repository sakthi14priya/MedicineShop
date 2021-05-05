package in.sakthi;

public class Details {
	// validate name
	public static boolean name(String name) {
		boolean isValid = true;
		if (name == null || name.trim().equals("")) {
			isValid = false;
			System.out.println("The name is not validated...");
		} else {
			System.out.println("################ USER DETAILS###############");
			System.out.println("The User Name is: " + name.trim());
			System.out.println("The name is validated...");
		}
		return isValid;
	}

	// validate mobileno
	public static boolean mobileno(String mobileno) {
		boolean isValid = true;
		if (mobileno.length() == 10) {
			System.out.println("The Mobile no is: " + mobileno);
			System.out.println("The Mobile no is validated...");
		} else {
			System.out.println("The Mobile no is not validated....");
		}
		return isValid;
	}

	// validate address
	public static boolean address(String address) {
		boolean isValid = true;
		if (address == null || address.trim().equals("")) {
			isValid = false;
			System.out.println("The name is not validated...");
		} else {
			System.out.println("The Address is: " + address.trim());
			System.out.println("The Address is validated...");
			System.out.println("The User Details is verified...");
		}
		return isValid;
	}
}
