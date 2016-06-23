package TestCasesClasses;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogInClass {

    static WebDriver driver = new ChromeDriver();

    public static void login(String Page_URL, String Tag_Username,String Tag_Password,String Tag_Submit, String Tag_Logout, String Username, String Password ) {
// Create a new instance of the Firefox driver

//  Wait For Page To Load
// Put a Implicit wait, this means that any search for elements on the page
// could take the time the implicit wait is set for before throwing exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// Navigate to URL
        driver.get(Page_URL);
// Maximize the window.
        driver.manage().window().maximize();
// Enter UserName
        driver.findElement(By.id(Tag_Username)).sendKeys(Username);
//Enter Next
//driver.findElement(By.id("next")).submit();  //May be next instead of submit
// Enter Password
        driver.findElement(By.id(Tag_Password)).sendKeys(Password);
// Wait For Page To Load
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
// Click on 'Sign In' button
        driver.findElement(By.name(Tag_Submit)).click();
//Click on 'Logout' Button
        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

//driver.findElement(By.xpath("//*[@id='gb_71']")).click();
//Close the browser.
    }
}

