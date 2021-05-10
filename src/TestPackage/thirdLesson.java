package TestPackage;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class thirdLesson 
{   
	@Parameters({"URL","APIKey/username"})
	@Test
	public void webLoginCarLoan(String urlname,String key)
	{
 System.out.println("Web login");
 System.out.println(urlname);
 System.out.println(key);
	}
	@Test(groups= {"smoke"})
	public void mobileLoginCarLoan()
	{
 System.out.println("Mobile login in");
	}
	@BeforeSuite
	public void beforeSuite()
	{
 System.out.println("I'm before suite");
	}
	@Test(dependsOnMethods= {"loginAPIcarLoan","mobileSignUpCarLoan"})
	public void mobileChangePassCarLoan()
	{
 System.out.println("Change mobile password");
	}
	@Test(dataProvider= "getData")
	public void mobileSignUpCarLoan(String username, String pass)
	{
 System.out.println("Mobile sign up");
 System.out.println(username);
 System.out.println(pass);
 
	}

	@Test
	public void loginAPIcarLoan()
	{
 System.out.println("API login");

	}
	@DataProvider
	public Object[][] getData()
	{
		Object data[][]= new Object[3][2];
		//1st set
		data[0][0]= "firstsetusername";
		data[0][1]= "password";
		
		//2nd set
		data[1][0]= "secondsetusername";
		data[1][1]= "secondpassword";
		
		//3rd set
		data[2][0]= "thirdsetusername";
		data[2][1]= "thirdpassword";
		return data;
		
	}
}


