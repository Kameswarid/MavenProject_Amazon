package source;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.failsafe.internal.util.Assert;

public class Loginpage 
{
	WebDriver driver;
	
	//step1
	@FindBy(xpath="//input[@id=\"ap_email\"]")
	WebElement email;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement pwd;
	
	@FindBy(xpath="//span[@id='continue']")
	WebElement click_continue;
	
	@FindBy(xpath="//span[@id='auth-signin-button']")
	WebElement signin_click;
	
	
	//step2
	public void un()
	{
		email.sendKeys("9849151263");
	}
	public void password()
	{
		pwd.sendKeys("srinarayana");
	}
	public void continueclick()
	{
		click_continue.click();
	}
	public void signinclick() throws InterruptedException
	{
		signin_click.click();
		Thread.sleep(4000);
	}
	
	
	
	

	
	//step3
	
	public Loginpage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
		
	}
}
