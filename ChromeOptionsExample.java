import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;


public class ChromeOptionsExample
{
    public static void main(String args[])  {
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\Users\\javva\\Downloads\\extension_6_1_12_0.crx"));
       // options.setAcceptInsecureCerts(true); If it is true insecure websites will open
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

//        driver.manage().window().fullscreen();
//        driver.get("https://expired.badssl.com/");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        String title= driver.getTitle();
//        System.out.println(title);

    }
}
