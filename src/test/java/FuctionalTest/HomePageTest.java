package test.java.FuctionalTest;

import main.java.PageEvents.HomePageEvents;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import test.java.BaseTest;

public class HomePageTest extends BaseTest {
    HomePageEvents homePageEvents=new HomePageEvents();

    @Test
    public void VerifyLogo(){
        BaseTest.logger.info("Verify logo title");
        Assert.assertEquals("Malih.Mail",homePageEvents.GetLogo());

    }
}
