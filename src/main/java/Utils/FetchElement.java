package main.java.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.java.BaseTest;

import java.util.List;

public class FetchElement {
    public WebElement getElement(String identifierType, String identifierValue) {
        switch (identifierType) {
            case "ID":
                return BaseTest.driver.findElement(By.id(identifierValue));
            case "XPATH":
                return BaseTest.driver.findElement(By.xpath(identifierValue));
            case "CSS":
                return BaseTest.driver.findElement(By.cssSelector(identifierValue));
            case "TAGNAME":
                return BaseTest.driver.findElement(By.tagName(identifierValue));
            default:return null;

        }
    }

    public List<WebElement> getListElement(String identifierType, String identifierValue) {
        switch (identifierType) {
            case "ID":
                return BaseTest.driver.findElements(By.id(identifierValue));
            case "XPATH":
                return BaseTest.driver.findElements(By.xpath(identifierValue));
            case "CSS":
                return BaseTest.driver.findElements(By.cssSelector(identifierValue));
            case "TAGNAME":
                return BaseTest.driver.findElements(By.tagName(identifierValue));
            default:return null;

        }
    }

}
