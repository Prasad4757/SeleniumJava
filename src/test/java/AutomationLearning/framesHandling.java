package AutomationLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class framesHandling {
    public static void main(String []args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SM265DG\\OneDrive - EY\\Documents\\GitHub\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ;

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--incognito");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");

        WebElement frame1=driver.findElement(By.xpath("//h2[contains(text(),'Iframe 1')]"));
        driver.switchTo().frame(frame1);

        WebElement iframe1= driver.findElement(By.xpath("src=\"new-tab-sample.php\""));
        driver.switchTo().frame(iframe1);

        driver.findElement(By.xpath("//a[@title=\"back to Selenium Tutorial\"]/parent::div")
        ).click();







    }
}
