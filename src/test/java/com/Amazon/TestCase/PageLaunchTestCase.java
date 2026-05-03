package com.Amazon.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class PageLaunchTestCase {
	
	public WebDriver driver;
  @Test
  public void appLaunch() {
	  
	  System.out.println("First Test Case!!");
	  driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  
  }
}
