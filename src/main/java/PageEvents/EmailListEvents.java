package main.java.PageEvents;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import main.java.PageObjects.EmailListObjects;
import main.java.Utils.FetchElement;
import org.apache.poi.hssf.record.FeatRecord;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.java.FuctionalTest.EmailListTest;

import java.util.List;

import static io.restassured.RestAssured.*;

public class EmailListEvents {

    public void gotoCreateEmaillist(){
        FetchElement f=new FetchElement();
        f.getElement("XPATH", EmailListObjects.newEmailListButton).click();
    }

    public Boolean CreateEmaillist(String username,String csv){
        FetchElement f=new FetchElement();
        f.getElement("XPATH", EmailListObjects.newEmailListButton).click();
        f.getElement("XPATH", EmailListObjects.emailListName).sendKeys(username);

        f.getElement("XPATH", EmailListObjects.FileUploader).sendKeys(csv);
       Boolean y= f.getElement("XPATH",EmailListObjects.craeteButton).isDisplayed();
       return y;
    }
     public void cancelcreate(){
         FetchElement f=new FetchElement();
         f.getElement("XPATH", EmailListObjects.newEmailListButton).click();
         f.getElement("XPATH",EmailListObjects.cancelButtom).click();
     }
     public String searchData(String searchKey){
         FetchElement f=new FetchElement();
         f.getElement("XPATH",EmailListObjects.searchField).sendKeys(searchKey);
          String text=f.getElement("XPATH",EmailListObjects.firstRow).getText();
          return text;
     }  public void redirectPage(String dr){
         FetchElement f=new FetchElement();
         if(dr=="Next"){         f.getElement("XPATH",EmailListObjects.nextbutton).click();}
         else if(dr=="Pre")
         { f.getElement("XPATH",EmailListObjects.prebutton).click();   }

     }

     public  String getResut(){
         FetchElement f=new FetchElement();
       return  f.getElement("XPATH",EmailListObjects.results).getText();
     }

     public String getselectedList(){
         FetchElement f=new FetchElement();
         String firstlist=f.getElement("XPATH",EmailListObjects.firstRow).getText();
         f.getElement("XPATH",EmailListObjects.firstRow).click();
         return firstlist;
     }
     public void gettableData(){
         FetchElement f=new FetchElement();
        List<WebElement> el=f.getListElement("Xpath",EmailListObjects.rowDicTable);
         System.out.println(el.size());
//        for (WebElement e:el){
//            System.out.println(e.getText());
//        }
     }
}
