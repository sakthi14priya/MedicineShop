package in.sakthi;

import java.util.HashSet;

public class AddDetails {
	public static void medicineName()
	{
	
	HashSet<String> medicines = new HashSet<String>();
	medicines.add("Augumentin");
	medicines.add("Azithromycin");
	medicines.add("Paracetommol");
	medicines.add("Ranitidine");
	medicines.add("piroxicam");
	medicines.add("Cough Syrup");
	System.out.println("The Medicine is Added:  "+ medicines);
	
	medicines.remove("Cough Syrup");
	System.out.println("The Medicine is Deleted: "+medicines);
}
}