package TestCasesClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


import java.util.concurrent.TimeUnit;
import org.testng.Assert;
/**
 * Created by Testing on 6/14/2016.
 */
public class CreateSurvey extends launchSite {

    public static void CreateSurvey() {
        WebElement TxtBoxContent;
        String name="-------David Rios Test 50-------";
        String description="This is an automated generated survey";
// Create a new instance of the Firefox driver
//  Wait For Page To Load
// Put a Implicit wait, this means that any search for elements on the page
// could take the time the implicit wait is set for before throwing exception
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// Navigate to URL
        driver.findElement(By.xpath("//*[@id=\"addButton\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("_name_id")).sendKeys(name);
        //driver.findElement(By.id("selector_hierarchy_l2")).clear();
        driver.findElement(By.id("selector_hierarchy_l2")).sendKeys("Test Facility");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("_description_id_ifr")).sendKeys(description);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"surveyDefinition\"]/div[8]/div/input[2]")).sendKeys(Keys.SPACE);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("_proceed")).sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String URLtext = driver.getCurrentUrl();

        //Assert.assertEquals( URLtext, "http://192.168.0.20:8080/admin/settings/surveyDefinitions/185");

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
        //driver.close();
    }




}
