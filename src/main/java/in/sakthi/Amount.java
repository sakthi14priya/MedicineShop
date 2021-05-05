package in.sakthi;

public class Amount {
	/**
	 * display the discount amount calculate the discount
	 * 
	 * @param amount
	 * @return
	 */
	public static int discount(int amount) {
		int discount = 0;
		int percentage = 0;
		if (amount < 1000) {
			percentage = 5;
			discount = amount - amount * percentage / 100;
		} else {
			percentage = 10;
			discount = amount - amount * percentage / 100;

		}
		System.out.println("The Discount is " + percentage + "% for your Purchase...");
		System.out.println("The Amount is : " + amount);
		System.out.println("The Discount Amount is: " + discount);
		System.out.println("The Disocunt amount is yours... Save Money...!");
		return amount;

	}

}
