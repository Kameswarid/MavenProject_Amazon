package test;

import java.time.Duration;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.Test;

import source.Homepage;
import source.Loginpage;

public class Testcase1 extends Launchquit //Login to Amazon
{
@Test
public void LogintoAmazon() throws InterruptedException
{
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	Homepage h1=new Homepage(driver);
	h1.aandlist(driver);
	h1.signingin(driver);
	
	Loginpage l1=new Loginpage(driver);
	l1.un();
	l1.continueclick();
	l1.password();
	l1.signinclick();
	
	
	
}
}
