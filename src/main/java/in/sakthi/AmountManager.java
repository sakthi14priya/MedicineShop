package in.sakthi;

import java.util.ArrayList;

public class AmountManager {
	public static ArrayList<Medicine> medicines = new ArrayList<Medicine>();

	public static int addAmount(String medicineName, int noOfTablet) {

		int price = MedicineManager.medicines.get(medicineName);
		int amount = price * noOfTablet;
		float gst = (amount * 5) / 100;
		float gstBill = gst + amount;

		Medicine medicine = new Medicine();
		medicine.medicineName = medicineName;
		medicine.noOfTablet = noOfTablet;
		medicine.amount = amount;
		medicine.gst = gst;
		medicine.gstBill = gstBill;
		medicines.add(medicine);
		System.out.println("Medicine Name: " + medicineName + "; noOfTablet: " + noOfTablet);

		return amount;
	}

	// Display the Medicine Details
	static void display() {
		System.out.println("##########MEDICINE DETAILS ############");
		for (Medicine medicine : medicines) {
			System.out.println(medicine.medicineName + " - " + medicine.noOfTablet + "; Rupees - " + medicine.amount
					+ "; gst-" + medicine.gst + "; gstBill-" + medicine.gstBill);
		}
	}

}
