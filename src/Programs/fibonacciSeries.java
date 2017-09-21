package Programs;

import org.junit.Test;

public class fibonacciSeries {

	@Test
	public void fibonacciTest()
	{
		int fibonacci=15;
		int a=0;
		int b=1;
		int c=1;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		for(int i=3;i<fibonacci;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
		}
	}
}
