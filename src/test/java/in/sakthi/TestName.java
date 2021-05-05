package in.sakthi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestName {
	// user details
	@Test
	public void testcase() {
		String name = " sakthi priya ";
		String mobileno = "8838193600 ";
		String address = "    Ayyampakkam,Chennai-12";
		Details.name(name);
		Details.mobileno(mobileno);
		Details.address(address);
	}
}
