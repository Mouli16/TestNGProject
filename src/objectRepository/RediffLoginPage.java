package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	WebDriver driver;
	public RediffLoginPage(WebDriver driver)
	{
		this.driver= driver;
	//	PageFactory.initElements(driver,this);
	}
	
	By username = By.xpath(".//*[@id='login1']");
	By password = By.name("passwd");	
	By go = By.name("proceed");
	
	//PageFactory
	
	/**@FindBy(xpath= ".//*[@id='login1']")
	WebElement username;
	
	@FindBy(name= passwd")
		WebElement password; **/
	
/**	public WebElement EmailId ()
	{
		return username
	} 
	
	public WebElement EmailId ()
	{
		return password
	} **/
	
	
	public WebElement EmailId ()
	{
		return driver.findElement(username);
	}
	
	public WebElement Password ()
	{
		return driver.findElement(password);
	}
	
	public WebElement submit ()
	{
		return driver.findElement(go);
	}
}
