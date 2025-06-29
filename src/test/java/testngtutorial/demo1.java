package testngtutorial;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
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
	
	@Parameters({"URL" , "Username"})
	@Test
	public void demoWelcome(String url, String username)
	{
		System.out.println("Hello TestNG Demo");
		System.out.println(url);
		System.out.println(username);

	}
	
	@Test(dataProvider="getData")
	public void demoData(String username, String password)
	{
		System.out.println("USERNAME = " + username);
		System.out.println("PASSWORD = " + password);
	}
	
	@BeforeTest
	public void dempPre()
	{
		System.out.println("Execute at First");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination- super admin - username & password
		//2nd combination- admin - username & password
		//3rd combination- user - username & password
		Object[][] data = new Object[3][2]; //3 combination with 2 values each
		
		//filling 1st combination data- super admin
		data[0][0]="superadmin123";
		data[0][1]="s@123";
		

		//filling 2nd combination data- admin
		data[1][0]="admin123";
		data[1][1]="a@123";
		

		//filling 3rd combination data- user
		data[2][0]="user123";
		data[2][1]="u@123";
		
		return data;
				
				
	}
}
