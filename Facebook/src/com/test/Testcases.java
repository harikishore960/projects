package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.LoginPage;

public class Testcases {

	WebDriver driver;

    LoginPage objLogin;

    @BeforeTest
    public void setup(){
       
        System.setProperty("webdriver.chrome.driver",".\\lib\\chromedriver.exe");
        // driver= new FirefoxDriver();
         driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    }
    @Test(priority=0)
    public void test_Home_Page_Appear_Correct() throws InterruptedException{

    objLogin = new LoginPage(driver);
  
    objLogin.login("username", "password");
    
   // objLogin.setpopupaccept();
	Thread.sleep(2000);
    objLogin.setPostwriter();
   
    objLogin.setPost("Hello World");
    objLogin.setpostbtn();

    // go the next page

    }

	
}
