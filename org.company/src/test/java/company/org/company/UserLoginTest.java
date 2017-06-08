package company.org.company;

import static org.junit.Assert.*;

import org.company.implementation.UserLogin;
import org.junit.Test;

public class UserLoginTest {

	@Test
	public void test() {
		UserLogin u=new UserLogin();
		assertEquals(true,u.validLogin("Manish", "Aricent"));
	}

}
