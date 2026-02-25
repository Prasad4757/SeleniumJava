package AutomationLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser {
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SM265DG\\OneDrive - EY\\Documents\\GitHub\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }
}
