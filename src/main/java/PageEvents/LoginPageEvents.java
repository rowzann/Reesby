package main.java.PageEvents;

import main.java.PageObjects.HomepageObjects;
import main.java.PageObjects.LoginObjects;
import main.java.Utils.FetchElement;
import test.java.BaseTest;

public class LoginPageEvents {
    FetchElement fetchElement = new FetchElement();

    public void loginFromCredentials(String username, String password) {
        fetchElement.getElement("XPATH", LoginObjects.username).sendKeys(username);
        fetchElement.getElement("XPATH", LoginObjects.password).sendKeys(password);
        fetchElement.getElement("XPATH", LoginObjects.signInButton).click();
    }

    public void loginFromGoogle() {
        fetchElement.getElement("XPATH", LoginObjects.signInWithGoogle).click();
    }

    public void dontHaveAnAccount() {
        fetchElement.getElement("XPATH", LoginObjects.createNewAccount).click();
    }

    public boolean verifyEmailFormatCheck( String usr){
                        fetchElement.getElement("XPATH", LoginObjects.username).sendKeys(usr);
        if(fetchElement.getElement("XPATH", LoginObjects.emailErrorMessage).getText().equalsIgnoreCase("email is not a valid email"))
        { return true;}
        else return false;
    }

}

