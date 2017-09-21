package Programs;

import org.testng.annotations.Test;

public class PrimeNumber {
	
	@Test
	public void testPrimeNumber()
	{
		boolean flag=true;
		int Number=15;
		for(int i=2; i<Number/2; i++)
		{
			if(Number%i==0)
			{
				flag=false;
			}
		}
		if (flag)
			System.out.println("Number is a Prime Number");
		else 
			System.out.println("Not a prime number");
	}
}
