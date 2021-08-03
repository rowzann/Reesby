package test.java.FuctionalTest;

import main.java.PageEvents.LoginPageEvents;
import main.java.Utils.Constants;
import org.apache.http.util.Asserts;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import test.java.BaseTest ;

public class LoginPageTest extends BaseTest {
    LoginPageEvents loginPageEvents=new LoginPageEvents();

    @Test(priority = 1)
    public void RedirectandVerifyCurrentPage(){
driver.get(Constants.url+"/auth/login");
        Assert.assertEquals(BaseTest.driver.getCurrentUrl(),Constants.url+"/auth/login");

    }
    @Test(priority = 2)
    public void VerifyValidLogin(){

        loginPageEvents.loginFromCredentials(Constants.username,Constants.password);
        Assert.assertEquals(BaseTest.driver.getCurrentUrl(),Constants.url+"/presentation");
    }

    @Test(priority = 3)
    public void inValidLogin(){
        driver.get(Constants.url+"/auth/login");
        loginPageEvents.loginFromCredentials("iooioi@tyfy.com","fff@ghf.com");
        Assert.assertFalse(Boolean.parseBoolean(BaseTest.driver.getCurrentUrl()),Constants.url+"/auth/login");
    }

    @Test(priority = 4)
    public void emailFormat(){
        driver.get(Constants.url+"/auth/login");
        loginPageEvents.loginFromCredentials("jhhgg",Constants.password);
       Assert.assertTrue(loginPageEvents.verifyEmailFormat()) ;

    }
}
