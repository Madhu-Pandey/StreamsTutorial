package testngtutorial;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo1 {
	
	@AfterSuite
	public void dempAfSuit()
	{
		System.out.println("Executing at the very last - After Suite Demo");
	}

	@AfterTest
	public void demoAfter()
	{
		System.out.println("Execute at Last");
	}
	@Parameters({"URL"})
	@Test
	public void demoWelcome(String url)
	{
		System.out.println("Hello TestNG Demo");
		System.out.println(url);
	}
	
	@BeforeTest
	public void dempPre()
	{
		System.out.println("Execute at First");
	}
}
