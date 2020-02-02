package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

WebDriver driver;

    
    By username = By.id("email");
    By password = By.id("pass");
    By loginbutton = By.id("loginbutton");
    By textwriter = By.id("placeholder-dqilj");
    By postbtn = By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[3]/div[2]/button");
    
    public  LoginPage(WebDriver driver){
        this.driver = driver;
    }
//    public String getsearchbocx(){
//        return driver.findElement(searchbox).SendKeys("IPhone");
//
//       }
    public void setUsername(String strusername){
      driver.findElement(username).sendKeys(strusername);
    }
    public void setPassword(String strpassword){
        driver.findElement(password).sendKeys(strpassword);
      }
    public void clickloginbutton(){
        driver.findElement(loginbutton).click();
      } 
    public void setPostwriter(){
    	driver.findElement(textwriter).click();
    }
    public void setPost(String strtextpost){
    	driver.findElement(textwriter).sendKeys(strtextpost);
    }
    public void setpostbtn(){
        driver.findElement(postbtn).click();
      } 
    public void setpopupaccept(){
        driver.switchTo().alert().dismiss();
      } 
    public void login(String strusername,String strpassword){
        this.setUsername(strusername);
        this.setPassword(strpassword);
        this.clickloginbutton();  
        
    }
}
