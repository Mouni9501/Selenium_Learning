import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample
{
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));

       WebElement source = driver.findElement(By.id("draggable"));
        System.out.println(source.getText());
       WebElement target = driver.findElement(By.id("droppable"));
        System.out.println(target.getText());
        Actions actions = new Actions(driver);


       // actions.dragAndDrop(source,target).perform();

       actions.clickAndHold(source).moveToElement(target).release().perform();
       // actions.dragAndDrop(source,target).perform();
      //actions.dragAndDrop()
       Thread.sleep(3000);
     driver.close();

    }
}
