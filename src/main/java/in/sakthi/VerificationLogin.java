package in.sakthi;

public class VerificationLogin {
	public static boolean mobileno(long mobileno) {
		String num = String.valueOf(mobileno);
		boolean isValid = true;
		if (num.length() == 10) {
			isValid = false;
			System.out.println("#####LOGIN PAGE#####");
			System.out.println("The mobile number is " + mobileno);
			System.out.println("The mobile number is validated...");
		} else {
			System.out.println("The mobile Number is not Validated...");
		}
		return isValid;
	}
	
	public static boolean password(String password) {
		boolean isValid = true;
		if (password.length() == 8) {
			isValid = false;
			System.out.println("The password is " + password);
			System.out.println("The password is validated...");
		} else {
			System.out.println("The password is not Validated...");
		}
		return isValid;
	}
}
