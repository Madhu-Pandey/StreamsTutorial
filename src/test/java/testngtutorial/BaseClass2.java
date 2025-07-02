package testngtutorial;

public class BaseClass2 extends BaseClass3{

	int a; //class variable
	
	//default constructor
	public BaseClass2(int a) //instance variable
	{
		super(a); //parent class constructor is invoked
		this.a = a; //this keyword
		
	}
	
	public int incrementVal()
	{
		a = a+1;
		return a;
	}
	
	public int decrementVal()
	{
		a = a-1;
		return a;
	}
}
