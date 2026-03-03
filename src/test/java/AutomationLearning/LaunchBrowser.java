package AutomationLearning;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LaunchBrowser {
    public static void main(String []args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SM265DG\\OneDrive - EY\\Documents\\GitHub\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());


        String title="GreenKart - veg and fruits kart";

        try{
            Assert.assertEquals(title, driver.getTitle());
            System.out.println("title is correct "+driver.getTitle());

        }
        catch(AssertionError e){
            System.out.println(e.getMessage()+ "title mismatch ");
        }

        driver.navigate().to("https://www.flipkart.com/");

        driver.navigate().back();
        driver.navigate().refresh();


        driver.quit();



    }
}
