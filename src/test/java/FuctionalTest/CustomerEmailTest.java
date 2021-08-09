package test.java.FuctionalTest;

import main.java.PageEvents.CustomerEmailListEvent;
import main.java.PageEvents.MenuEvents;
import main.java.Utils.testData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.java.BaseTest;

public class CustomerEmailTest extends BaseTest {
    CustomerEmailListEvent customerEmailListEvent=new CustomerEmailListEvent();
    MenuEvents m= new MenuEvents();

//    @Test
//    public void verifyCreatenewContacte(){
//        driver.get("http://malih-frontend.s3-website-ap-southeast-2.amazonaws.com/email-list/56");
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/button")).click();
//        CustomerEmailListEvent customerEmailListEvent=new CustomerEmailListEvent();
//        customerEmailListEvent.addnewcustomer();
//
//    }
    @Test
    public void verifySearchData() throws InterruptedException {
        driver.get("http://malih-frontend.s3-website-ap-southeast-2.amazonaws.com/email-list/64");
        Thread.sleep(2000);
        customerEmailListEvent.searchData(testData.userName1);
        Assert.assertEquals(customerEmailListEvent.gettableDatarow().size(),1);
        for(WebElement w: customerEmailListEvent.gettableDatarow()){
            Assert.assertNotNull(w);
            Assert.assertTrue(w.getText().contains(testData.userName1));
        }
    }
   @Test
    public void verifyPageinfuntionality(){

       driver.get("http://malih-frontend.s3-website-ap-southeast-2.amazonaws.com/email-list/64");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[3]/button")).click();
        Assert.assertTrue(customerEmailListEvent.gettableDatarow().size()==10);
        customerEmailListEvent.getPageIg();
       Assert.assertEquals(customerEmailListEvent.gettableDatarow().size(),5);
   }

}
