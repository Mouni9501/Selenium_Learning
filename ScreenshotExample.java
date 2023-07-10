import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ScreenshotExample
{
    public static void main(String args[]) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.google.com/");
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       // FileUtils.copyFile(screenshot,new File("C:\\Users\\javva\\OneDrive\\Documents\\Selenium Screenshots\\FirstScreenshot.png"));
        System.out.println("Screenshot got captured");
        driver.close();
    }
}
