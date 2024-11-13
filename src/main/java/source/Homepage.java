package source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.checkerframework.dataflow.qual.AssertMethod;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.failsafe.internal.util.Assert;

//import dev.failsafe.internal.util.Assert;

public class Homepage {
    WebDriver driver;
    
	//step1
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement accountandlist;

	@FindBy(xpath="(//span[@class=\"nav-action-inner\"])[1]")
	WebElement sign_in;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement search_tf;
	
	@FindBy(xpath="(//span[@class='a-size-base-plus a-color-base a-text-normal'])[4]")
	WebElement item;
	
	@FindBy(xpath="//input[@id='add-to-wishlist-button-submit']")
	WebElement addwish;
	
	@FindBy(xpath="//span[@class='nav-text'])[12]")
	WebElement yourWishList;
	
	@FindBy(xpath="//span[@id='pab-I21I2RB0PNVWCB']")
	WebElement addtocart;
	
	@FindBy(xpath="//span[@class='a-button a-spacing-medium a-button-span12 a-button-base']")
	WebElement viewcart;
	
	//step2
	public void aandlist(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist).perform();
		
	}
	
	public void signingin(WebDriver driver)
	{
		sign_in.click();
		
		
		
	}
	public void search(WebDriver driver) throws InterruptedException
	{
		
		search_tf.sendKeys("toys"+Keys.ENTER);
		Thread.sleep(3000);
	}
	public void assertcheck(WebDriver driver)
	{
		WebElement e2=driver.findElement(By.xpath("//span[.=\"Hello, Kameswari\"]"));
	boolean b1=e2.isDisplayed();
	System.out.println(b1);
	Assert.isTrue(true,"success");
	//Reporter.log("success"+ b1); 
    
	}
	
	public void addwish(WebDriver driver) throws InterruptedException
	{
		item.click();
		Thread.sleep(3000);
		Set<String> s1= driver.getWindowHandles();
		Iterator i1= s1.iterator();
		String parentId= (String) i1.next();
		String childId= (String) i1.next();
		driver.switchTo().window(childId);
		addwish.click();
		
	}
	
	public void addcart(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(3000);
		/*Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist).perform();*/
		//yourWishList.click();
		//Thread.sleep(5000);
		viewcart.click();
		addtocart.click();
		
	}
	
	
	
	//step3
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
}
