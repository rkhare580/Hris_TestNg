package Code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	public boolean Select_Login_With_Valid_Credentials(WebDriver driver)
	{
		driver.findElement(By.cssSelector("input#txtUserName")).sendKeys("rohitkhare");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Rohit@321#");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
String exp_url="https://hris.qainfotech.com:8086/time/timesheet";
String act_url=driver.getCurrentUrl();
if(exp_url.equals(act_url))
{
	return true;
}
else
	return false;
	}
	
	
	
	public String Select_Login_With_Invalid_Credentials(WebDriver driver)
	{
		driver.findElement(By.cssSelector("input#txtUserName")).clear();
		driver.findElement(By.cssSelector("input#txtUserName")).sendKeys("INVALID_USERNAME");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("INVALID_PASSWORD");
		driver.findElement(By.cssSelector("input[type='submit']")).click();	
		driver.findElement(By.cssSelector("a[href='#panel1']")).click();
		String act_url=driver.findElement(By.cssSelector("div[class='loginTxt txtHideDiv alert alert-error']>div")).getText();
		System.out.println(act_url);
		return act_url;
	}
	public boolean Select_Login_With_Blank_Username(WebDriver driver)
	{
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("PASSWORD");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		String exp_url=driver.findElement(By.cssSelector("input#txtUserName")).getAttribute("style");
		if(exp_url.contains("red"))
		{
			return true;
		}
		else
			return false;
	}
	public boolean Select_Login_With_Blank_Password(WebDriver driver)
	{
		driver.findElement(By.cssSelector("input#txtUserName")).sendKeys("rohitkhare");
		driver.findElement(By.cssSelector("input#txtPassword")).clear();
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		String exp_url=driver.findElement(By.cssSelector("input#txtPassword")).getAttribute("style");
		System.out.println(exp_url);
		if(exp_url.contains("red"))
		{
			return true;
		}
		else
			return false;
	}
	
}
