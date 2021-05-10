package TestCases;
import objectRepository.RediffLoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.RediffLoginPage;

public class LoginApplication {
	
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mouli Sarkar\\Documents\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginPage rd= new RediffLoginPage(driver);
		rd.EmailId().sendKeys("hello");
		rd.Password().sendKeys("123");
		rd.submit().click();
		
		
		
	}
	
	

}
