package pom_Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import POM.login;

public class login_Test {

	@Test
	public void login_Test()
	{
		System.setProperty("webdriver.chrome.driver", "../Ohrm/drivers/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "../Ohrm/drivers/geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		login l =new login(driver);
		l.setCredentials("Admin", "admin123");
	//	driver.close();
		
	}
}
