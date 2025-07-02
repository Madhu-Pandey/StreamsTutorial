package testngtutorial;

import org.testng.annotations.Test;

public class ChildClass extends BaseClass{

	@Test
	public void childTask()
	{
		System.out.println("This is child method");
		int a=3;
		// base class object
		BaseClass2 obj = new BaseClass2(a); //parameterized constructor
		System.out.println(obj.incrementVal());
		System.out.println(obj.decrementVal());
		//super keyword concept
		System.out.println(obj.multiplyTwo());
		System.out.println(obj.multiplyThree());
		

		}
}
