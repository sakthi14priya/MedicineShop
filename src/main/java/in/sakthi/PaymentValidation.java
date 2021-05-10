package in.sakthi;

public class PaymentValidation {

	public static boolean mobileno(long mobileno) {
		String num = String.valueOf(mobileno);
		boolean isValid = true;
		if (num.length() == 10) {
			System.out.println("The Mobile no is: " + mobileno);
			System.out.println("The Mobile no is validated...");
		} else {
			System.out.println("The Mobile no is not validated....");
			System.out.println("Please Check Your Mobile Number");
		}
		return isValid;

	}

	public static boolean cardno(long cardno) {
		String num = String.valueOf(cardno);
		boolean isValid = true;
		if (num.length() == 16) {
			System.out.println("The card Number is: " + cardno);
			System.out.println("The Card Number is validated...");
		} else {
			System.out.println("The Card Number is not validated...");
			System.out.println("Please Check Your Card Number");
		}
		return isValid;
	}

	public static boolean pinno(int pinno, int amount) {
		String num = String.valueOf(pinno);
		boolean isValid = true;
		if (num.length() == 4) {
			System.out.println("The Pin no is: " + pinno);
			System.out.println("The Pin no is validated...");
			System.out.println("The Total is: " + amount);
		} else {
			System.out.println("The pin no is not validated....");
			System.out.println("Please Check Your pin Number");
		}

		System.out.println("Paid Successfully...");
		System.out.println("___________________________________________________");
		System.out.println("Your Medicine is delivered from within few days....");
		System.out.println("Thank You! Take Care for your Health...");
		System.out.println("___________________________________________________");
		return isValid;
	}
}
