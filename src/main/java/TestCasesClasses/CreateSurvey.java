package TestCasesClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Testing on 6/14/2016.
 */
public class CreateSurvey extends LogInClass {

    public static void CreateSurvey() {
        WebElement TxtBoxContent;
        String name="-------David Rios Test-------";
        String description="This is an automated generated survey";
// Create a new instance of the Firefox driver
//  Wait For Page To Load
// Put a Implicit wait, this means that any search for elements on the page
// could take the time the implicit wait is set for before throwing exception
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// Navigate to URL
        driver.findElement(By.xpath("//*[@id=\"sidemenu\"]/li[2]/a")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("_name_id")).sendKeys(name);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("_description_id_ifr")).sendKeys(description);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"surveyDefinition\"]/div[10]/div/input[3]")).sendKeys(Keys.SPACE);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("_proceed")).click();
// Maximize the window.

// Enter UserName
        //driver.findElement(By.id(Tag_Username)).sendKeys(Username);
//Enter Next
//driver.findElement(By.id("next")).submit();  //May be next instead of submit
// Enter Password
        //driver.findElement(By.id(Tag_Password)).sendKeys(Password);
// Wait For Page To Load
        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
// Click on 'Sign In' button
        //driver.findElement(By.name(Tag_Submit)).click();
//Click on 'Logout' Button
        //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//a[contains(text(),'Add new survey')]")).click();

//driver.findElement(By.xpath("//*[@id='gb_71']")).click();
//Close the browser.
        driver.close();
    }




}
