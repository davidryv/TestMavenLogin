package TestCasesClasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import TestCasesClasses.XML_Reader;

public class SampleTest {


    @Test
    public void testmethod1() {

        XML_Reader.XMLReader();
        Assert.assertTrue(true);
    }

    @Test
    public void testmethod2(){
        CreateSurvey.CreateSurvey();

    }

}
