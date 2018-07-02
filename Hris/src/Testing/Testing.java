package Testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import Code.Login;
import Code.Logout;

public class Testing extends DriverCreation{
	
	@Test(priority=1)
	public void Verify_Login_With_Blank_Username()
	{
	Assert.assertTrue(new Login().Select_Login_With_Blank_Username(driver));	
	}
	@Test(priority=2)
	public void Verify_Login_With_Blank_Password()
	{
		Assert.assertTrue(new Login().Select_Login_With_Blank_Password(driver));
	}
	@Test(priority=3)
	public void Verify_Login_With_Invalid_Credentials()
	{
		Assert.assertEquals(new Login().Select_Login_With_Invalid_Credentials(driver),"Invalid Login");
	}
	@Test(priority=4)
	public void Verify_Login_With_Valid_Credentials()
	{
		Assert.assertTrue(new Login().Select_Login_With_Valid_Credentials(driver));
	}
	@Test(priority=5)
	public void Verify_Logout()
	{
		Assert.assertTrue(new Logout().Select_Logout(driver));
	}
	
	   
}
