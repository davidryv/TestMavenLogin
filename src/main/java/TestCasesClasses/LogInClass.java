package TestCasesClasses;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LogInClass extends launchSite{


    public static void login( String tagusername,String tagpassword,String tagsubmit, String username, String usernamepassword ) {
// Create a new instance of the Firefox driver

//  Wait For Page To Load
// Put a Implicit wait, this means that any search for elements on the page
// could take the time the implicit wait is set for before throwing exception
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// Navigate to URL
        //driver.get(pageURL);
// Maximize the window.
        //driver.manage().window().maximize();
// Enter UserName
        driver.findElement(By.id(tagusername)).sendKeys(username);
//Enter Next
//driver.findElement(By.id("next")).submit();  //May be next instead of submit
// Enter Password
        driver.findElement(By.id(tagpassword)).sendKeys(usernamepassword);
// Wait For Page To Load
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
// Click on 'Sign In' button
        driver.findElement(By.name(tagsubmit)).click();
//Click on 'Logout' Button
        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

//driver.findElement(By.xpath("//*[@id='gb_71']")).click();
//Close the browser.
    }
}

