package AutomationLearning;

import junit.framework.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Logincheck {
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\SM265DG\\OneDrive - EY\\Documents\\GitHub\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ;

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--incognito");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        driver.get("https://askomdch.com/");
        String expectedTitle="AskOmDch – Become a Selenium automation expert!";

        try {
            Assert.assertEquals(expectedTitle,driver.getTitle());
            System.out.println("Home Title is correct as "+driver.getTitle());
        }
        catch(AssertionError e){
            System.out.println("Home Title mismatch"+driver.getTitle()+" the error is "+e.getMessage());

        }

        driver.findElement(By.xpath("//ul[@id=\"ast-hf-menu-1\"]/child::li[@id=\"menu-item-1237\"]/child::a")).click();

        String expectedAccountTitle="Account – AskOmDch";
        try {
            Assert.assertEquals(expectedAccountTitle,driver.getTitle());
            System.out.println("Account Title is correct as "+driver.getTitle());
        }
        catch(AssertionError e){
            System.out.println("Title mismatch"+driver.getTitle()+" the error is "+e.getMessage());

        }

        WebElement username =driver.findElement(By.xpath("//input[@id=\"username\"]"));
        username.sendKeys("magix12@gmail.com");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("magix@tutu1234");
        String inputUser = username.getAttribute("value");

        driver.findElement(By.xpath("//button[contains(text(),\"Log in\")]")).click();



        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement welcome = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//p[contains(., 'Hello')]")));

           //String msg=welcome+" "+username.getText();


        String welcomeText = welcome.getText().trim();
        System.out.println("Welcome text: " + welcomeText);

// Validate login by Hello + display name
        if (welcomeText.toLowerCase().startsWith("hello")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed");
        }








    }
}
