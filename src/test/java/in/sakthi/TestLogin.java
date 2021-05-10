package in.sakthi;

import org.junit.Test;

public class TestLogin {

	@Test
	public void test() {
		long mobileno = 8838193600L;
		String password ="45126378";
		VerificationLogin.mobileno(mobileno);
		VerificationLogin.password(password);
		
	}

}
