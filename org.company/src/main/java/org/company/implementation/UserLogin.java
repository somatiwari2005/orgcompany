/**
 * 
 */
package org.company.implementation;

import org.company.dao.CheckLogin;

/**
 * @author gur46237
 *
 */
public class UserLogin implements CheckLogin {

	public boolean validLogin(String userName,String password)
	{
		if(((userName.equals("Manish")) && (password.equals("Aricent"))))
				{
			return true;
				}
		else
		{
			return false;
		}
	}
}
