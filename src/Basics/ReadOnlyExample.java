package Basics;

public class ReadOnlyExample implements interfaceClass {

	public final int x;
	public final int y=10;
	public final int z;
	 
	ReadOnlyExample(){
		x=10;
		z=10;
	}
	
	ReadOnlyExample(int x, int z)
	{
		this.x=x;
		this.z=z;
	}
	public void printline()
	{
		System.out.println("Inside Base Class");
	}
	public void xyz()
	{
		System.out.println("Inside xyz method");
	}
	public void abc()
	{
		System.out.println("Inside abc method");
	}
}
