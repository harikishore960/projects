package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TripadvisorPage {

WebDriver driver;

    
    By searchbox = By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div[2]/div/div/div[5]/div");
    By search = By.id("mainSearch");
    By searchbutton = By.id("SEARCH_BUTTON_CONTENT");
    By selectvalue = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[1]/div/div[3]/div/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/div[1]/div[1]/span");
    By writereview = By.xpath("//*[@id='component_12']/div/div[2]/div/div[2]/div/div[1]/a");
    By ratingbtn = By.xpath("/html/body/div[4]/div[2]/div/div/form/div[1]/div/fieldset[1]/div[2]/div/div/div[1]/div[2]/div[2]/span");
    By bubblerating = By.className("ui_bubble_rating fl bubble_50"); 
    By titlereveiw = By.id("ReviewTitle");
    By yourreveiw = By.id("ReviewText");
    By bubblerating1 = By.id("qid12_bubbles");
    By bubblerating2 = By.id("qid11_bubbles");
    By bubblerating3 = By.id("qid13_bubbles");
    By clickcheckbox = By.id("noFraud");
    By submitbtn = By.id("SUBMIT");
    
    
    
    public  TripadvisorPage(WebDriver driver){
        this.driver = driver;
    }
//    public String getsearchbocx(){
//        return driver.findElement(searchbox).SendKeys("IPhone");
//
//       }
    public void clicksearch(){
      driver.findElement(searchbox).click();
    }
    public void searchtext(String strsearch){
        driver.findElement(search).sendKeys(strsearch);
      }
    public void clicksearchbtn(){
        driver.findElement(searchbutton).click();
      } 
    public void setselectvalue(){
    	driver.findElement(selectvalue).click();
    }
    
    public void writereveiwbtn(){
    	driver.findElement(writereview).click();
    }
    public void setratingbtn(){
    	driver.findElement(ratingbtn).click();
    }
    public void bubbleratingbtn(){
    	//driver.findElement(bubblerating).click();
    	Actions action = new Actions(driver);
    	WebElement we = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/form/div[1]/div/fieldset[1]/div[2]/div/div/div[1]/div[2]/div[2]/span"));
    	action.moveToElement(we).click().build().perform();
    }
    public void settitlereveiw(String strtitlereveiw){
    	driver.findElement(titlereveiw).sendKeys(strtitlereveiw);
    }
    public void setyourreveiw(String stryourreveiw){
        driver.findElement(yourreveiw).sendKeys(stryourreveiw);
      } 
    public void bubbleratingbtn1(){
    	driver.findElement(bubblerating1).click();
    }
    public void bubbleratingbtn2(){
    	driver.findElement(bubblerating2).click();
    }
    public void bubbleratingbtn3(){
    	driver.findElement(bubblerating3).click();
    }
    public void setcheckbox(){
    	driver.findElement(clickcheckbox).click();
    }
    public void submitbtn(){
    	driver.findElement(submitbtn).click();
    }
   
    
//    public void setpopupaccept(){
//        driver.switchTo().alert().dismiss();
//      } 
   
    
	
}
