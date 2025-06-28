package testngtutorial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo3 {

	@BeforeMethod
	public void beforeEvery()
	{
		System.out.println("Execute before each test methods Demo3 Class");
	}
	
	@AfterMethod
	public void afterEvery()
	{
		System.out.println("Execute after each test methods Demo3 Class");
	}
	
	@Test
	public void apiLogin()
	{
		System.out.println("API Loggedin");
	}
	
	@BeforeSuite
	public void apiBefore()
	{
		System.out.println("Executing Before suite in API to set header keys");
	}
	
	@Test
	public void apiLogout()
	{
		System.out.println("API logged out");
	}
}
