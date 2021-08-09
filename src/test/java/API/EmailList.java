package test.java.API;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class EmailList {
    Response response=given().when().get("http://malih-auth.ap-southeast-2.elasticbeanstalk.com/campaign/getAllEmailListNames");
    @Test
    public void getEmailListResponseAPI(){
     int statuscode= response.getStatusCode();
     Assert.assertEquals(200,statuscode);
    }
    @Test
    public void VerifyEmailListContains(){
        String body=response.getBody().asString();
        Assert.assertEquals(body.contains("beta"),true);
    }

}
