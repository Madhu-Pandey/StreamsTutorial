package testngtutorial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	@BeforeMethod
	public void beforeTask()
	{
		System.out.println("This is Before Method");
	}

	@AfterMethod
	public void afterTask()
	{
		System.out.println("This is After Method");
	}
}
