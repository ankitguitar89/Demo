package Programs;

public class Palindrome {

	public static void main(String args[])
	{
		String palindrome="Ankit";
		//palindrome.equalsIgnoreCase("");
		StringBuilder palin=new StringBuilder(palindrome);
		System.out.println(palin);
		System.out.println(palin.reverse());
		String x=palin.reverse().toString();
System.out.println(x+palindrome.equalsIgnoreCase(x));
		System.out.println("String is Palindrome =>"+palin.equals(palin.reverse()));
	}
}
