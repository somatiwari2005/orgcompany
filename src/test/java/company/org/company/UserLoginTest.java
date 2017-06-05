/**
 * 
 */
package company.org.company;

import static org.junit.Assert.*;

import org.company.implementation.UserLogin;
import org.junit.Test;

/**
 * @author gur46237
 *
 */
public class UserLoginTest {

	@Test
	public void test() {
		
		UserLogin userLogin=new UserLogin();
		assertEquals(true, userLogin.validLogin("Manish", "Aricent"));
	}

}
