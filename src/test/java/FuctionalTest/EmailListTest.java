package test.java.FuctionalTest;


import main.java.PageEvents.CustomerEmailListEvent;
import main.java.PageEvents.EmailListEvents;
import main.java.Utils.Constants;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.java.BaseTest;

import java.util.List;

public class EmailListTest extends BaseTest {
    String url="http://malih-frontend.s3-website-ap-southeast-2.amazonaws.com/email-list";

    @Test
    public void verifyCancelCration(){
        EmailListEvents e= new EmailListEvents();
        driver.get(url);
        e.cancelcreate();
        Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase(Constants.url+"/email-list"));
        System.out.println(driver.getCurrentUrl());
    }
      @Test
    public void verifyNewCreatedEmail(){
          EmailListEvents e= new EmailListEvents();
          driver.get(url);
          e.CreateEmaillist("Rojan Dhakal","C://Users//Rowzan//IdeaProjects//Reesby//src//main//resources//annual-enterprise-survey-2020-financial-year-provisional-csv.csv");
          Assert.assertEquals(driver.getCurrentUrl(),url);
      }

}
