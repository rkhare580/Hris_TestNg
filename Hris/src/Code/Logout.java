package Code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout {

	public boolean Select_Logout(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("a.profile-btn")).click();
//		driver.findElement(By.cssSelector("a[href*='logoff']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Logout']"))).click();
        String exp_url="https://hris.qainfotech.com/login.php";
        String act_url=driver.getCurrentUrl();
        if(exp_url.equals(act_url))
        {
	      return true;
         }
        else return false;
	}
}
