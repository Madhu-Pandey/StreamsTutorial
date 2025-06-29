package testngtutorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo2 {

	@BeforeClass
	public void beforeClass()
	
	{
		System.out.println("executing this before class in Demo2");
	}
	@AfterClass
	public void afterClass()
	
	{
		System.out.println("executing this after class in Demo2");
	}
	@Test(groups= {"Smoke"})
	public void webLogin()
	{
		System.out.println("Web Loggedin");
	}
	@Parameters({"URL"})
	@Test
	public void webLogout(String url)
	{
		System.out.println("Web Logged out");
		System.out.println(url);
	}
}
