package com.Amazon.TestCase;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class PageLaunchTestCase {
	
	 WebDriver driver;
  @Test
  public void browserTest() throws MalformedURLException, InterruptedException {
	  
	  ChromeOptions options =new ChromeOptions();
	  driver=new RemoteWebDriver(new URL("http://localhost:4444"),options);
	  Thread.sleep(10000);
	  driver.get("https://www.amazon.in/");
	  Thread.sleep(10000);
	  driver.quit();
	  
	  /*if(bname.equals("Chrome"){
		  
	  } 
	  String bname
	  
	  System.out.println("First Test Case!!");
	  driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  */
  }
}
