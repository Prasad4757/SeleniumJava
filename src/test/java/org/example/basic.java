package org.example;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class basic {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Users//SM265DG//OneDrive - EY//Documents//GitHub//chromedriver-win64//chromedriver-win64//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.xpath("//input[@id=\"inputUsername\"]")).sendKeys("magix");
        driver.findElement(By.xpath("//input[@name=\"inputPassword\"]")).sendKeys("magix@123");
        driver.findElement(By.xpath("//input[@id=\"chkboxOne\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"chkboxTwo\"]")).click();
        driver.findElement(By.xpath("//button[@class=\"submit signInBtn\"]")).click();
        String errormsg=driver.findElement(By.xpath("//p[@class=\"error\"]")).getText();
        try {
            Assert.assertEquals(errormsg, "* Incorrect username or password");
            System.out.println("Successfully steps "+errormsg);
        }
        catch(Exception e){
            System.out.println("mismatched got error ");

            System.out.println(e.getMessage());

        }

        driver.findElement(By.xpath("//div[@class=\"forgot-pwd-container\"]/a[text()=\"Forgot your password?\"]")).click();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement forgotpass=driver.findElement(By.xpath("(//h2[text()=\"Forgot password\"]//parent::form[@action=\"#\"])"));
        wait.until(ExpectedConditions.visibilityOf(forgotpass));

        boolean b=forgotpass.isDisplayed();

        driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("magix");
        driver.findElement(By.xpath("//input[@placeholder=\"Email\"]")).sendKeys("magix@123");
        driver.findElement(By.xpath("//input[@placeholder=\"Phone Number\"]")).sendKeys("42424324422");
        driver.findElement(By.xpath("//button[@class=\"go-to-login-btn\"]")).click();
}
}