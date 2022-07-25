package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TC01 {
	public WebDriver driver;
	
	@Test
	public void init()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");				
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("name");
		driver.findElement(By.id("pass")).sendKeys("build");
				
	}
	
}
