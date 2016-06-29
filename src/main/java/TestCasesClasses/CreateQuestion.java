package TestCasesClasses;

/**
 * Created by Testing on 6/28/2016.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;
import org.testng.Assert;


public class CreateQuestion extends launchSite{
    public static void CreateQuestion() {

        driver.findElement(By.xpath("//div[@id=\"addButton\" and normalize-space(.)=\"New Page\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className("fancybox-lock")));
        driver.switchTo().frame(driver.findElement(By.xpath("*//iframe[contains(@class,\"fancybox-iframe\")]")));
        //driver.findElement(By.id("_title_id"));

        driver.findElement(By.xpath("//*[@id=\"_title_id\"]")).sendKeys("Test Page");
        driver.findElement(By.id("_instructions_id")).sendKeys("1.-Test Instruction");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//div[@id=\"addButton\" and normalize-space(.)=\"New Question\"]")).click();
        driver.findElement(By.id("type")).sendKeys("Yes No DropDown");
        driver.findElement(By.className("mceContentBody")).sendKeys("Test Question?");
        driver.findElement(By.xpath("//*[@id=\"proceed")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
}
