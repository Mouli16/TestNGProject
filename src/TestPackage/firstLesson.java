package TestPackage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class firstLesson {

	@Test
	public void Demo()
	{
 System.out.println("First test");
Assert.assertTrue(false);
	}
	@Test(groups= {"smoke"})
	public void SecondDemo()
	{
 System.out.println("Second test");
	}
	
	@AfterTest
	public void PostRequisite()
	{
 System.out.println("I will execute last");
	}
}
