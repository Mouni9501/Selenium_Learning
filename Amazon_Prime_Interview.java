import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Prime_Interview
{
    public static void main(String args[])
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/amazonprime?ref_=nav_cs_primelink_nonmember");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//a[@id=\"nav-link-amazonprime\"]"))).build().perform();
        String result = driver.findElement(By.cssSelector(".pin-nav-content-img .pin-nav-content-copy")).getText();
        System.out.println(result);

    }
}
