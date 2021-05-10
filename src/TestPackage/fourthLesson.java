package TestPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class fourthLesson 
{
	@Test
	public void webLoginHomeLoan()
	{
 System.out.println("First test of 4th lesson-Home");
	}
	@Test(enabled= false)
	public void mobileLoginHomeLoan()
	{
 System.out.println("Second test of 4th lesson-Home");
	}

	@Test(groups= {"smoke"})
	public void loginAPIHomeLoan()
	{
 System.out.println("Third test of 4th lesson-Home");
	}
	
	@AfterSuite
	public void afterSuite()
	{
 System.out.println("I'm the last one");
	}
}
