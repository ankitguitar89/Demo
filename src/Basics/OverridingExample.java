package Basics;

public class OverridingExample extends ReadOnlyExample{

	@Override
	public void printline()
	{
		System.out.println("Inside derived class");
		
	}
}

