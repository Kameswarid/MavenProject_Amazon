package test;

import org.testng.annotations.Test;

import source.Homepage;
import source.Loginpage;

public class Testcase2 extends Launchquit
{
	@Test
	public void searching() throws InterruptedException
	{
	Homepage h1=new Homepage(driver);
	h1.aandlist(driver);
	h1.signingin(driver);
	
	Loginpage l1=new Loginpage(driver);
	l1.un();
	l1.continueclick();
	l1.password();
	l1.signinclick();
	h1.search(driver);
	h1.assertcheck(driver);
}
}
