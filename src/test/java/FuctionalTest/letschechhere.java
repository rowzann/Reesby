package test.java.FuctionalTest;

import main.java.PageEvents.EmailListEvents;
import main.java.Utils.ExcelWorksheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import test.java.BaseTest;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class letschechhere  {
    WebDriver driver;

//    @Test
//    public  void getel() throws InterruptedException, IOException {
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "Drivers" + File.separator + "chromedriver.exe");
//       driver=new ChromeDriver();
//       driver.get("http://malih-frontend.s3-website-ap-southeast-2.amazonaws.com/email-list/64");
//       driver.findElement( By.xpath("//*[@id=\"root\"]/div[1]/div[3]/button")).click();
//       Thread.sleep(2000);
        //System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div[1]/div/div[1]/div/a")).getText());
//       List <WebElement> el=driver.findElements(By.xpath("/html/body/div/div/div/div/div/div[3]/div"));
//        for (int i=0;i<el.size();i++){
//            System.out.println(el.get(i).getText());
//            //String name=driver.findElement(By.xpath(""));
//
//        }
//         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[2]/div[1]/div/div/div/input")).sendKeys("milton");
//        List <WebElement> w= driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div[1]/div[2]/div/div[1]/table/tbody/tr"));
//        System.out.println((w.size()));


    @Test
    public void onr(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "Drivers" + File.separator + "chromedriver.exe");
       driver=new ChromeDriver();
       driver.get("http://malih-frontend.s3-website-ap-southeast-2.amazonaws.com/email-list");
       driver.findElement( By.xpath("//*[@id=\"root\"]/div[1]/div[3]/button")).click();

    WebElement list= driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div[3]/div[8]/div[]"));
    List<WebElement>el= list.findElements(By.className("jss164"));
        for(WebElement l:el){
            System.out.println(l.getText());
        }



        driver.quit();
    }


}
