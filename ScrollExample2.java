import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ScrollExample2
{
    @Test
    public void addingValuesInAColumn()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
        List<WebElement> values = driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
        int sum =0;
//        for(int i=0;i<values.size();i++)
//        {
//            int value = Integer.parseInt(values.get(i).getText());
//            sum = value+sum;
//            System.out.println(sum);
//        }
        for(WebElement colVal:values)
        {
            int value = Integer.parseInt(colVal.getText());//Since getText() returns "String" we are doing type casting to Integer
            sum = value+sum;
        }
        System.out.println(sum);
        Assert.assertEquals(sum,235);
        driver.close();
    }
    @Test
    public void scrollExample()
    {
        WebDriver driver = new SafariDriver();
       // HtmlUnitDriver = new HtmlUnitDriver();
        //ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=200");
        List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int result =0;
        for(int i=0;i<values.size();i++)
        {
            int value = Integer.parseInt(values.get(i).getText());
            result = value+result;
        }
            System.out.println(result);
        String val = driver.findElement(By.className("totalAmount")).getText();
        int totalAmount = Integer.parseInt(val.split(":")[1].trim());
        Assert.assertEquals(result,totalAmount);
        driver.close();
    }
}
