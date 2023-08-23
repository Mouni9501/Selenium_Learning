import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocatorsExample
{
    public static void main(String args[])
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        WebElement nameField = driver.findElement(By.name("name"));
        String label = driver.findElement(with(By.tagName("label")).above(nameField)).getText();
        System.out.println(label);
        //WebElement password = driver.findElement(By.id("exampleInputPassword1"));
       String text = driver.findElement(with(By.tagName("div")).below(driver.findElement(By.id("exampleInputPassword1")))).getText();
       System.out.println(text);
       driver.findElement(with(By.tagName("input")).toLeftOf(By.xpath("//label[@for='inlineRadio1']"))).click();
        System.out.println("Radio button got selected");
       driver.close();
    }
}
