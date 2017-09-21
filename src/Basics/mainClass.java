package Basics;

public class mainClass {
public static void main(String args[]) {

	OverridingExample a= new OverridingExample();
//	OverridingExample b= new ReadOnlyExample();  ERROR ON THIS LINE- CANNOT Convert from Base class to Derived Class
	ReadOnlyExample c= new OverridingExample();
	ReadOnlyExample d= new ReadOnlyExample();
	
	a.printline();
	c.printline();
	d.printline();	
	
	
}
}
