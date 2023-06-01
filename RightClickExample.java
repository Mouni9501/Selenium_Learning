
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickExample
{
    public static void main(String args[])  {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        Actions actions = new Actions(driver);
        WebElement button = driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
        actions.contextClick(button).build().perform(); //Performs right click action
        System.out.println(button.getText());
        driver.findElement(By.xpath("//li[@class=\"context-menu-item context-menu-icon context-menu-icon-copy\"]")).click();
        String textOnAlert = driver.switchTo().alert().getText();
        System.out.println(textOnAlert);
        driver.switchTo().alert().accept();
        driver.close();
    }
}
