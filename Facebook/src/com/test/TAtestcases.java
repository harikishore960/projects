package com.test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.pages.TripadvisorPage;

public class TAtestcases {

	WebDriver driver;

    TripadvisorPage objtrip;

    @BeforeTest
    public void setup(){
       
        System.setProperty("webdriver.chrome.driver",".\\lib\\chromedriver.exe");
        // driver= new FirefoxDriver();
         driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.tripadvisor.in/");
        
    }
  
	
    @Test(priority=0)
    public void test_Home_Page() throws InterruptedException{

    	objtrip = new TripadvisorPage(driver);
  
    	JavascriptExecutor js = (JavascriptExecutor) driver;
//    	js.executeScript("window.scrollBy(0,20)");
    	objtrip.clicksearch();
    	objtrip.searchtext("Club Mahindra");
    	objtrip.clicksearchbtn();
    	objtrip.setselectvalue();

    	ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
    	driver.switchTo().window(tabs.get(1));
    	js.executeScript("window.scrollBy(0,1500)");
    	objtrip.writereveiwbtn();
    	
    	driver.switchTo().window(tabs.get(2));
    	Thread.sleep(2000);
    	objtrip.bubbleratingbtn();
    	
    	objtrip.settitlereveiw("Hi this is the application for reveiw ");
    	objtrip.setyourreveiw("Welcome to the app");
    	objtrip.bubbleratingbtn1();
    	objtrip.bubbleratingbtn2();
    	objtrip.bubbleratingbtn3();
    	objtrip.setcheckbox();
    	objtrip.submitbtn();
    	
    	
    }
}
