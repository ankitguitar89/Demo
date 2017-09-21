package testWebsite;

import org.openqa.selenium.firefox.*;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class TestScriptTest {
  @Test
  public void reverseString() {
	  String a="Reverse This String";
	  String c="";
	  char d;
	  StringBuilder b = new StringBuilder();
	 int charInString=a.length();
	 for(int i=charInString-1;i>=0;i--)
	 {
		 d=a.charAt(i);
		 c.concat(Character.toString(d));
		 b.append(a.charAt(i));
	 }
	 System.out.println("OriginalString="+a+" and reversed String ="+b+" String c="+c);
  }
  
  @Test
  public static void login()
  {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.flipkart.com");
	  driver.manage().window().maximize();
  }
  
  @Test
  public static void charCount()
  {
	  String inputString="aabbccDdEeffff";
	  
	  Map<Character, Integer> inputCount= new HashMap<Character,Integer>();
	  if(inputString!=null)
	  {
		  for(Character c:inputString.toCharArray())
		  {
			  Integer Count=inputCount.get(c);
			  int newcount=(Count==null?1:Count+1);
			  inputCount.put(c, newcount);
		  }
	  }
	  
/*	  for(Map<Character, Integer> a: inputCount.keySet())
	  {
		  System.out.println(inputCount.keySet());
//		  System.out.println("Character "+a+"="+inputCount.containsValue(a));
	  }
	*/		  
  }
  
  @BeforeTest  
  public void setDriver()
  {
	System.setProperty("webdriver.gecko.driver", ".\\Drivers\\FirefoxDriver\\geckodriver.exe");
	System.setProperty("webdriver.chrome.driver", ".\\Drivers\\ChromeDriver\\chromedriver.exe");
  }
  
  

}
