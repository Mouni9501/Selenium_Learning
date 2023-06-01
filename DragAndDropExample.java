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
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");

       WebElement source = driver.findElement(By.id("node5"));
        System.out.println(source.getText());
       WebElement target = driver.findElement(By.id("box4"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(source).moveToElement(target).release().build().perform();
      // actions.dragAndDrop(source,target).build().perform();
       Thread.sleep(3000);
       driver.close();

    }
}
