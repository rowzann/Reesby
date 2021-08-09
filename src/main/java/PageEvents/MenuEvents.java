package main.java.PageEvents;

import main.java.PageObjects.MenuObjects;
import main.java.Utils.FetchElement;

public class MenuEvents {
    FetchElement f= new FetchElement();
    private Object EmailListEvents;

    public void gotoDashboard(){
            f.getElement("XPATH", MenuObjects.Dashboard).click();
    }
    public void gotoEmailist(){
        f.getElement("XPATH", MenuObjects.emailList).click();

    }
    public void gotoSettings(){
        f.getElement("XPATH", MenuObjects.Setting).click();
    }
    public void gotoCampaign(){
        f.getElement("XPATH", MenuObjects.campaign).click();
    }
    public void cancelHelpPopUp(){
        f.getElement("XPATH", MenuObjects.helpPopUp).click();
    }

}
