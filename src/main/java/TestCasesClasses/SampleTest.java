package TestCasesClasses;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
import org.testng.annotations.Test;
import TestCasesClasses.XML_Reader;

public class SampleTest {
    String[] configuration = new String [8];

    @Test(groups = "ReadXML")
    public void loadXMLConfig (){
        System.out.println("Running Test With The Following Information");
        configuration=XML_Reader.XMLReader();
        Assert.assertTrue(true);
    }

    @Test(dependsOnGroups = "ReadXML",groups="launchSite")
    public void launchesSite(){
        launchSite.launch(configuration[5]);
        Assert.assertTrue(true);

    }
    @Test(dependsOnGroups = "launchSite",groups="login")
   public void loginSite() {

        LogInClass.login(configuration[1],configuration[2],configuration[3], configuration[6], configuration[0]);
        Assert.assertTrue(true);
    }

    @Test (dependsOnGroups = "login",groups="createSurvery")
    public void CreateSurvery(){
        CreateSurvey.CreateSurvey();
        Assert.assertTrue(true);
    }

    @Test (dependsOnGroups = "createSurvery",groups="createQuestion")
    public void CreateQuestion(){
        CreateQuestion.CreateQuestion();
        Assert.assertTrue(true);
    }

}
