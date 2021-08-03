package main.java.PageEvents;

import main.java.PageObjects.HomepageObjects;
import main.java.Utils.FetchElement;

public class HomePageEvents {
    FetchElement fetchElement=new FetchElement();
    public String GetLogo(){

        String string=fetchElement.getElement("XPATH", HomepageObjects.Logo).getText();
        return string;
    }


}
