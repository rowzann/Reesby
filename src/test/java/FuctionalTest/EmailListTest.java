package test.java.FuctionalTest;


import main.java.PageEvents.CustomerEmailListEvent;
import main.java.PageEvents.EmailListEvents;
import main.java.Utils.Constants;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.java.BaseTest;

import java.util.List;


public class EmailListTest extends BaseTest {
    String url="http://malih-frontend.s3-website-ap-southeast-2.amazonaws.com/email-list";

  @Test
    public void verifyCancelCration() throws InterruptedException {
        EmailListEvents e= new EmailListEvents();
        driver.get(url);
        e.cancelcreate();
        Assert.assertEquals(driver.getCurrentUrl(),url);

    }
    //  @Test
    public void verifyNewCreatedEmail(){
          EmailListEvents e= new EmailListEvents();
          driver.get(url);
       Boolean y=   e.CreateEmaillist("Rojan Dhakal","C:/Users/Rowzan/IdeaProjects/Reesby/src/main/resources/Reesbyapi.xlsx");
          Assert.assertTrue(y);
      }
      @Test
      public void VerifySearchData(){
          EmailListEvents e= new EmailListEvents();
          driver.get(url);
          driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/button")).click();
        Assert.assertEquals(e.searchData("Many Data"),"Many Data");
      }

    //  @Test
    public void Verify_next_Pre_button_fun(){
          EmailListEvents e= new EmailListEvents();
          driver.get(url);
          driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/button")).click();
          e.redirectPage("Next");
          Assert.assertTrue(e.getResut().contains("Page 2 of 4"));
          e.redirectPage("Pre");
          Assert.assertTrue(e.getResut().contains("Page 1 of 4"));
      }
        @Test
    public void verifyListPage(){
            EmailListEvents e= new EmailListEvents();
            driver.get(url);
           // driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/button")).click();
           String title= e.getselectedList();
           CustomerEmailListEvent c= new CustomerEmailListEvent();

           Assert.assertTrue(c.getTitleofCustomer().contains(title));
        }
}
