import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


public class BrokenLinkExample
{
    public static void main(String args[]) throws IOException {
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://commons.apache.org/proper/commons-io/download_io.cgi");
       List<WebElement> allLinks = driver.findElements(By.cssSelector("a[href*='commons/io']"));
       SoftAssert softAssert = new SoftAssert();
       for(WebElement link: allLinks)
       {
           String url = link.getAttribute("href");
           HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
           conn.setRequestMethod("GET");
           conn.connect();
           int responseCode = conn.getResponseCode();
           System.out.println(responseCode);
           softAssert.assertTrue(responseCode<400,"This link got failed " +link.getText() + " with response code  " +responseCode);
       }
      softAssert.assertAll();
//        driver.get("https://commons.apache.org/proper/commons-io/download_io.cgi");
//        String url = driver.findElement(By.cssSelector("a[href*='commons-io-2.12.0-bin.zip']")).getAttribute("href");
//        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection(); // if i don't cast to HttpURLConnection what will happen
//        conn.setRequestMethod("GET");
//        conn.connect();
//        int responseCode = conn.getResponseCode();
//        System.out.println(responseCode);
          driver.close();
    }

}
