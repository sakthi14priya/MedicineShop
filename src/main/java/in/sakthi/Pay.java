package in.sakthi;

public class Pay {
	/**
	 * select any one...cash on delivery or online payment you select the online
	 * payment type phone number,card pinnumber and amount
	 * 
	 * @param phonenumber
	 * @param pinnumber
	 * @param amount
	 * @param name
	 * @param name1
	 * @return
	 */
	public static int paid(long phonenumber, int pinnumber, int amount, String name, String name1) {
		if (name == "online payment") {
			System.out.println("You are a cash on delivery");
			System.out.println("Okk! Caring Your Dreams....");
		} else {
			System.out.println("You are a online payment...");
			System.out.println("The Phone no is: " + phonenumber);
			System.out.println("The pinnumber is: " + pinnumber);
			System.out.println("The Amount is: " + amount);
		}
		System.out.println("Paid Successfully...");
		System.out.println("___________________________________________________");
		System.out.println("Your Medicine is delivered from within few days....");
		System.out.println("Thank You! Take Care for your Health...");
		System.out.println("___________________________________________________");
		return amount;
	}

}
