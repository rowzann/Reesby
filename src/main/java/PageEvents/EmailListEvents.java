package main.java.PageEvents;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import main.java.PageObjects.EmailListObjects;
import main.java.Utils.FetchElement;
import org.apache.poi.hssf.record.FeatRecord;
import org.openqa.selenium.WebElement;
import test.java.FuctionalTest.EmailListTest;

import java.util.List;

import static io.restassured.RestAssured.given;

public class EmailListEvents {

    public void gotoCreateEmaillist(){
        FetchElement f=new FetchElement();
        f.getElement("XPATH", EmailListObjects.newEmailListButton).click();
    }

    public void CreateEmaillist(String username,String csv){
        FetchElement f=new FetchElement();
        f.getElement("XPATH", EmailListObjects.newEmailListButton).click();
        f.getElement("XPATH", EmailListObjects.emailListName).sendKeys(username);
        f.getElement("XPATH", EmailListObjects.FileUploader).sendKeys(csv);
        f.getElement("XPATH",EmailListObjects.craeteButton);
    }
     public void cancelcreate(){
         FetchElement f=new FetchElement();
         f.getElement("XPATH", EmailListObjects.newEmailListButton).click();
         f.getElement("XPATH",EmailListObjects.cancelButtom);
     }
}
