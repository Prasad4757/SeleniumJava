package AutomationLearning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class alerts {
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\SM265DG\\OneDrive - EY\\Documents\\GitHub\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ;

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--incognito");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
        Alert a = driver.switchTo().alert();
        System.out.println(a.getText());
        a.accept();


       try {
           WebElement text1 = driver.findElement(By.xpath("//p[contains(text(),\"You successfully clicked an alert\")]"));

           WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
           wait.until(ExpectedConditions.visibilityOf(text1));
           System.out.println("clicked alert sucessfully  "+text1.getText());


       } catch (AssertionError e) {
           System.out.println("not clicked or handled alert "+e.getMessage());
       }

        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
        Alert b = driver.switchTo().alert();
        System.out.println(b.getText());
        b.accept();

        try {
            WebElement text2 = driver.findElement(By.xpath("//p[contains(text(),'You clicked:')]"));

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOf(text2));
            System.out.println("clicked ok alert sucessfully   "+ text2.getText());


        } catch (AssertionError e) {
            System.out.println("not clicked or handled alert "+e.getMessage());
        }

        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
        Alert c = driver.switchTo().alert();
        System.out.println(c.getText());
        c.sendKeys("Welocme to space");
        c.accept();


        try {
            WebElement text3 = driver.findElement(By.xpath("//p[contains(text(),'You entered:')]"));

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOf(text3));
            System.out.println("entered details in alert sucessfully   "+ text3.getText());
        }

        catch (AssertionError e){
            System.out.println("not clicked or handled alert "+e.getMessage());
        }



//        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
//        System.out.println(a.getText());
//        a.dismiss();




    }
}
