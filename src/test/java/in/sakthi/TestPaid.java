package in.sakthi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPaid {

	@Test
	//card details
	public void testcase() {
		long phonenumber = 8838193600L;
		int pinnumber = 4367;
		int amount = 5427;
		String name = "cash on delivery";
		String name1 = "online payment";
		System.out.println("The choice is yours: cash on delivery ,online payment");
		Pay.paid(phonenumber, pinnumber, amount, name, name1);
	}

}
