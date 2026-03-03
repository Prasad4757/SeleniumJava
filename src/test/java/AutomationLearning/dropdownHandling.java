package AutomationLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownHandling {
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver","");
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        

    }
}
