package main.java.PageEvents;

import main.java.PageObjects.CustomerEmailListObjects;
import main.java.Utils.FetchElement;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;


public class CustomerEmailListEvent {
    Random r = new Random();
    char c = (char)(r.nextInt(26) + 'a');
    FetchElement f=new FetchElement();
    public void addnewcustomer(){
        f.getElement("XPATH",CustomerEmailListObjects.addButton).click();
        f.getElement("XPATH",CustomerEmailListObjects.fullname).sendKeys("Test"+c);
        f.getElement("XPATH",CustomerEmailListObjects.email).sendKeys("test@mail.com");
        f.getElement("XPATH",CustomerEmailListObjects.phone_number).sendKeys(c+"123");
        f.getElement("XPATH",CustomerEmailListObjects.homeAddress).sendKeys(c+" street1");
        f.getElement("XPATH",CustomerEmailListObjects.job_title).sendKeys("tester");
        f.getElement("XPATH",CustomerEmailListObjects.createButton).click();


    }

    public void searchData(String data)  {
        f.getElement("XPATH",CustomerEmailListObjects.Searchbox).sendKeys(data);
    }
    public List<WebElement> gettableDatarow(){


       List <WebElement> row = f.getListElement("XPATH",CustomerEmailListObjects.tableDataRow);
       return row;
    }
    public void getPageIg(){
        f.getElement("XPATH",CustomerEmailListObjects.rowsPerPagebutton).click();
        f.getElement("XPATH",CustomerEmailListObjects.rowsPerPagebutton5).click();
    }
}
