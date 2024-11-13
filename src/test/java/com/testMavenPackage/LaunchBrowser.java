package com.testMavenPackage;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LaunchBrowser {
@Test()
public void launch()
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");	
}
}
