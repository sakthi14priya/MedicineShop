package in.sakthi;

import org.junit.Test;

public class TestDisplayMedicine {

	@Test
	public void testcase() {

		// DISPLAY THE MEDICINE
		System.out.println("#####DISPLAY THE MEDICINE NAME#####");
		String[] medicineName = { "1.Augumentin", "2.Azithromycin", "3.Paracetommol", "4.Ranitidine", "5.piroxicam" };
		MedicineName.name(medicineName);
	}
}
