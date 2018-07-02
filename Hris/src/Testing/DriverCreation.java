package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DriverCreation {

	static WebDriver driver;
	
	@BeforeClass
	public void Launch_Hris()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rohitkhare\\eclipse-workspace\\Hris\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://hris.qainfotech.com/login.php");
		driver.findElement(By.cssSelector("a[href='#panel1']")).click();
		driver.manage().window().maximize();
	}
//	@AfterClass
//	public void Quit_Hris()
//	{
//		driver.close();
//	}
}
