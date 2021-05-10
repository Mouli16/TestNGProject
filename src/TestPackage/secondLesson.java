package TestPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class secondLesson 
{
	@Test(groups= {"smoke"})
	public void Demo()
	{
 System.out.println("Second Lesson");
	}
	
	@BeforeTest
	public void PreRequisite()
	{
 System.out.println("I will run first");
	}
}