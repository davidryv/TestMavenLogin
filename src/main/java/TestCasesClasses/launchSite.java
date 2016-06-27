package TestCasesClasses;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Testing on 6/23/2016.
 */
public class launchSite {

    static WebDriver driver = new ChromeDriver();

    public static void launch(String pageURL) {
// Create a new instance of the Firefox driver

//  Wait For Page To Load
// Put a Implicit wait, this means that any search for elements on the page
// could take the time the implicit wait is set for before throwing exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// Navigate to URL
        driver.get(pageURL);
// Maximize the window.
        driver.manage().window().maximize();

//Close the browser.
    }

}
