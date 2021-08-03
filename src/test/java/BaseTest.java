package test.java;

import main.java.Utils.Constants;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;
    public ExtentHtmlReporter htmlReporter;
    public static ExtentReports extentReport;
    public static ExtentTest logger;


    @BeforeClass
    @Parameters(value={"browserName"})
    public void setup( String browsername){
        setDriver(browsername);
        driver.get(Constants.url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }
    @BeforeTest
    public void before() {
        htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+File.separator+"Report"+File.separator+"test.html");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setDocumentTitle("Reesbu-Malih-Automation");
        htmlReporter.config().setReportName("Malih-Test");
        htmlReporter.config().setTheme(Theme.DARK);
        extentReport=new ExtentReports();
        extentReport.attachReporter(htmlReporter);
        extentReport.setSystemInfo("Tester","Rojan Dhakal");
        logger=extentReport.createTest("Malia Mail");
    }


//    @BeforeMethod
//    @Parameters(value={"browserName"})
//    public void beforeMethodTest(String browsername) {
//        setDriver(browsername);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//    }


    @AfterMethod
    public void aftermethodTest(ITestResult result) {

        if(result.getStatus()==ITestResult.SUCCESS) {
            String methodName = result.getMethod().getMethodName();
            String logText="Test case:"+methodName+"Passed";
          Markup m= MarkupHelper.createLabel(logText,ExtentColor.GREEN);
         logger.log(Status.PASS,m);
        }else if (result.getStatus()==ITestResult.FAILURE){
            String methodName = result.getMethod().getMethodName();
            String logText="Test case:"+methodName+"Failed";
            Markup m= MarkupHelper.createLabel(logText,ExtentColor.RED);
            logger.log(Status.FAIL,m);
        }

    }

    @AfterTest
    public void after() {
        extentReport.flush();

    }
    @AfterClass
    public void afterclass(){
        driver.quit();
    }

    public void setDriver(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "Drivers" + File.separator + "chromedriver.exe");
            driver=new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + File.separator + "Drivers" + File.separator + "geckodriver.exe");
            driver=new FirefoxDriver();
        }else
        {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "Drivers" + File.separator + "chromedriver.exe");
            driver=new ChromeDriver();
        }
    }


}