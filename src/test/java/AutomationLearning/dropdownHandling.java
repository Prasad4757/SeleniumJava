package AutomationLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropdownHandling {
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver","");
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement drpdown=driver.findElement(By.xpath("//select[@id=\"dropdown\"]"));
        Select s=new Select(drpdown);
        s.selectByVisibleText("Option 2");

        System.out.println(s.getFirstSelectedOption());

        List<WebElement> ls=s.getOptions();
        for(WebElement element:ls){

        }




    }
}
