package AutomationLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class HandlingWindows {
    public static void main(String []args){
        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\SM265DG\\OneDrive - EY\\Documents\\GitHub\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ;

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--incognito");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        driver.get("https://www.amazon.in/");

        String parent=driver.getWindowHandle();
        WebElement best= driver.findElement(By.xpath("//a[text()='Bestsellers']//ancestor::div[@id=\"nav-xshop-container\"]"));
          best.click();
        Set<String> child=driver.getWindowHandles();

        for(String all:child){
            driver.switchTo().window(all);
            if(driver.getTitle().equalsIgnoreCase("Amazon.in Bestsellers: The most popular items on Amazon")){
                System.out.println("Im in the best seller page");

                driver.close();
                driver.switchTo().window(parent);
            }
            else{
                System.out.println("page not found");
            }

            driver.quit();
        }


    }
}
