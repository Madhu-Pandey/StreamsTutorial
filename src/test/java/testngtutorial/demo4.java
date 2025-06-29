package testngtutorial;

import org.testng.annotations.Test;

public class demo4 {
	
	@Test(groups= {"Smoke"})
	public void mobileLogin()
	{
		System.out.println("Mobile Loggedin");
	}
	
	@Test(enabled=false)
	public void mobileOTP()
	{
		System.out.println("Enter Mobile OTP");
	}
	@Test(dependsOnMethods= {"mobileLogin" ,"mobileLogout"})
	public void mobileDemo()
	{
		System.out.println("Welcome to Mobile");

	}
	@Test(timeOut=4000)
	public void mobileLogout()
	{
		System.out.println("Mobile logged out");
	}

}
