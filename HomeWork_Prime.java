import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeWork_Prime
{
    public static void main(String args[])
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"))).build().perform();
        String response = driver.findElement(By.xpath("//span[text()='Explore Showroom']")).getText();
        System.out.println(response);
        driver.close();
    }
}
