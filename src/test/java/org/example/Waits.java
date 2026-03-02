package org.example;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver","C://Users//SM265DG//OneDrive - EY//Documents//GitHub//chromedriver-win64//chromedriver-win64//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Dynamic Loading")).click();

            String url="https://the-internet.herokuapp.com/dynamic_loading";

            Assert.assertEquals(driver.getCurrentUrl(),url);
            System.out.println("Url is passed "+driver.getCurrentUrl());

        //catch (AssertionError e){
            //System.out.println("wrong url - failed an the url is "+driver.getCurrentUrl()+"error is  "+e.getMessage());



        driver.findElement(By.linkText("Example 2: Element rendered after the fact")).click();

        WebElement button=driver.findElement(By.xpath("//div[@id=\"start\"]"));
        System.out.print(button.isDisplayed());
        System.out.println(button.isEnabled());

        WebDriverWait w8=new WebDriverWait(driver,Duration.ofSeconds(10));
        button=w8.until(ExpectedConditions.elementToBeClickable(button));
        button.click();


//        WebElement finish=driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]//parent::div[@id=\"finish\"]"));
//        //finish. click();






    }
}
