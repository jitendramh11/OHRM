package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	@FindBy (xpath="//input[@placeholder='Username']")
	private WebElement user;
	@FindBy (xpath="//input[@placeholder='Password']")
	private WebElement pass;
	@FindBy (xpath="//button[@type='submit']")
	private WebElement login_btn;
	
	public login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setCredentials(String username,String password)
	{
		user.sendKeys(username);
		pass.sendKeys(password);
		login_btn.click();
	}
}
