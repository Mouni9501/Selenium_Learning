import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot
{
    public static void main(String args[]) throws IOException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        File sourceFile = driver.getScreenshotAs(OutputType.FILE);
        File destFile = new File(".C:\\Users\\javva\\Downloads\\Git repository\\Selenium_Learning\\Screenshots\\img1.jpg");
        FileUtils.copyFile(sourceFile,destFile);
        System.out.println("Screenshot saved successfully");
        driver.quit();
    }
}
