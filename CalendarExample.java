import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class CalendarExample
{
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.makemytrip.com/");
        driver.findElement(By.xpath("//label[@for='departure']")).click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0,200)");
        List<WebElement> dates = driver.findElements(By.xpath("//div[contains(@class, 'DayPicker-Day') and @aria-disabled='false']"));
        for(int i=0;i< dates.size();i++)
        {
            String requiredDate = driver.findElements(By.xpath("//div[contains(@class, 'DayPicker-Day') and @aria-disabled='false']")).get(i).getText();
            System.out.println(requiredDate);
            if(requiredDate.contains("28"))
            {
                driver.findElements(By.xpath("//div[contains(@class, 'DayPicker-Day') and @aria-disabled='false']")).get(i).click();
                Thread.sleep(3000);
                System.out.println("Date got clicked");
                break;
            }
        }
        driver.close();



    }
}
