package in.sakthi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMedicine {

	@Test
	public void testcase() {

		// Medicine List
		AmountManager.addAmount("Augumentin", 5);
		System.out.println("No of items in medicines :" + AmountManager.medicines.size());
		AmountManager.display();
	}

}
