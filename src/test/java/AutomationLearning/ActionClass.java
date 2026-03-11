package AutomationLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionClass {
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\SM265DG\\OneDrive - EY\\Documents\\GitHub\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ;

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--incognito");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
//        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//
//        WebElement desk=driver.findElement(By.xpath("//h4[text()='Cucumber - 1 Kg']/ancestor::div[@class='product']//button[text()='ADD TO CART']"));
//
//
//
    //    Actions a=new Actions(driver);
//        //a.moveToElement(desk).click().perform();
//        a.contextClick(desk).perform();
//       // a.doubleClick(desk).perform();
        driver.get("https://codepen.io/EpsilonDeltaCriterion/pen/jLoPgE");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.transform = 'scale(0.7)'; document.body.style.transformOrigin = '0 0';");

        WebElement drag =driver.findElement(By.xpath("//div[text()='Rome']/ancestor::div[@id=\"dropContent\"]"));
        WebElement drop =driver.findElement(By.xpath("//div[text()='United States']"));
        Actions a=new Actions(driver);

        a.dragAndDrop(drag,drop).perform();
        //a.clickAndHold(drag).moveToElement(drop).release().build().perform();


    }
}
