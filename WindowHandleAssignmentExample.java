import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandleAssignmentExample
{
    public static void main(String args[])
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> windowItr = windows.iterator();
        String parentWindow = windowItr.next();
        String childWindow = windowItr.next();
        driver.switchTo().window(childWindow);
        String textInChildWindow = driver.findElement(By.cssSelector("div h3")).getText();
        System.out.println(textInChildWindow);
        driver.switchTo().window(parentWindow);
        String textInParentWindow = driver.findElement(By.cssSelector("div h3")).getText();
        System.out.println(textInParentWindow);
        driver.quit();
    }

}
