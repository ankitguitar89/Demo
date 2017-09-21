package Programs;
import org.testng.annotations.*;

public class Factorial {

	@Test
	public void factorialTest()
	{
		int x=1;
		int factorial=5;
		for(int i=1; i<=factorial;i++)
		{
			x=x*i;
		}
		System.out.println(x);
	}
	
	@Test
	public void recursiveFactorialTest()
	{
		int factorial=5;
		int i=1;
		int x=1;
		int z=factorial(factorial,i,x);
		
		System.out.print("Factorial is "+z);
	}
	
	public int factorial(int factorial, int i,int x)
	{
		while(i!=factorial)
		{
			i++;
			x=x*i;
			factorial(factorial,i,x);
		}
		return x;
	}
	
}
