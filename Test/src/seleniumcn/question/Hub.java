package seleniumcn.question;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import org.testng.Assert;
import java.net.URL;

/**
@author Bruce Gu
**/
public class Hub {
	
	public  static final String SELENIUMCN_LINK = "//td[div/span[contains(.,'seleniumcn.cn/ ')]]/h3//a";

	WebDriver driver;
	
	@Test
	public void TestOne() throws Exception {	

		DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
		driver = new RemoteWebDriver(new URL("http://192.168.0.13:4444/wd/hub"), capability);
		
		driver.get("http://www.baidu.com");

		
		WebElement query = driver.findElement(By.name("wd"));
		query.sendKeys("selenium ������̳");

		WebElement btn = driver.findElement(By.id("su"));
		btn.click();
		Thread.sleep(5000);
		

		WebElement link = driver.findElement(By
				.xpath(SELENIUMCN_LINK));
		link.click();
		Thread.sleep(5000);
		
		driver.switchTo().window(driver.getWindowHandles().toArray(new String[0])[1]);
		
		String expectedTitle ="Selenium ������̳, Webdriver ������̳, Selenium2, �������,web�Զ�������";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);		

	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	
}

