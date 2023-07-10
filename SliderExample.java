import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderExample
{
    public static void main(String args[])
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Slider.html");
        WebElement source = driver.findElement(By.cssSelector(".col-xs-8.col-xs-offset-2 #slider"));
        Actions action = new Actions(driver);
        action.click(source).dragAndDropBy(source,-30,50).build().perform();
    }
}
