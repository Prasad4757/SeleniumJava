package org.example;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class basic {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Users//SM265DG//OneDrive - EY//Documents//GitHub//chromedriver-win64//chromedriver-win64//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//        WebElement drpdown= driver.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]"));
//        Select s=new Select(drpdown);
//        s.selectByValue("option2");
//        WebElement selectedoption=s.getFirstSelectedOption();
//        System.out.println(selectedoption.getText());

        driver.get("https://www.spicejet.com/");
        driver.findElement(By.xpath("//div[@class=\"r-1862ga2 r-1loqt21 r-1enofrn r-tceitz r-u8s1d css-76zvg2\" and contains(text(),'From')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Ahmedabad')]")).click();
        driver.findElement((By.xpath("//div[contains(text(),\"Pune International Airport\")]"))).click();
        driver.findElement(By.xpath("//div[text()=\"Departure Date\"]")).click();
        driver.findElement(By.xpath("//div[contains(text(),\"Family & Friends\")]")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement searchFlightBtn = wait.until(ExpectedConditions.elementToBeClickable(
//                By.xpath("//div[text()='Search Flight']")
//        ));
//        searchFlightBtn.click();
        //driver.findElement(By.xpath("//div[text()=\"Search Flight\"]")).click();

        WebElement searchBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[text()='Search Flight']")
        ));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", searchBtn);
        searchBtn.click();




    }
}