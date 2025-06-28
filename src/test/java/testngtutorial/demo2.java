package testngtutorial;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo2 {

	@Test
	public void webLogin()
	{
		System.out.println("Web Loggedin");
	}
	
	@Test
	public void webLogout()
	{
		System.out.println("Web Logged out");
	}
}
