package CollectionExamples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String args[])
	{
		Map<Character, Integer> oc=new HashMap<Character, Integer>();
		String base="AaaaBbcccc";
		for(int i=0;i<base.length();i++)
		{	
			if(!oc.containsKey(base.charAt(i)))
				oc.put(base.charAt(i), 1);
			else
				oc.put(base.charAt(i), oc.get(base.charAt(i))+1);
		}
		System.out.println(oc);
	}
}
