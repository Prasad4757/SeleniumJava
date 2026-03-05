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
           System.out.println("clicked alert sucessfully");


       } catch (AssertionError e) {
           System.out.println("not clicked or handled alert "+e.getMessage());
       }


//        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
//        System.out.println(a.getText());
//        a.dismiss();




    }
}
