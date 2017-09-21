package testWebsite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	static WebDriver driver;
	
	@FindBy(how=How.ID, using="")
	static WebElement txtUserName;
	
	public static void login(String userName, String password)
	{
		driver.findElement(By.id("")).sendKeys(userName);
		driver.findElement(By.id("")).sendKeys(password);
		
		Actions a= new Actions(driver);
		a.contextClick().perform();
	}
}