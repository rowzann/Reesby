package test.java.API;

import io.restassured.response.Response;
import main.java.Utils.ExcelWorksheet;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import test.java.BaseTest;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class validateAPIresponse extends BaseTest{
   private String type;
   private String apiurl;



    @Test
    public void validateGetResponse() throws IOException {
      List<HashMap> arr=new LinkedList<>();
      HashMap<String,String> api =new HashMap<>();
      ExcelWorksheet e = new ExcelWorksheet();
      arr = e.readExcel("C://Users//Rowzan//IdeaProjects//Reesby//src//main//resources//", "Reesbyapi.xlsx", "Sheet1");

      for (HashMap h:arr) {
          String type = h.get("type").toString();
          String apiurl = h.get("api").toString();
          if (type.equalsIgnoreCase("get")) {
              Response response = given().when().get(apiurl);

              int StatusCode = response.getStatusCode();
              Assert.assertEquals(StatusCode, 200);
              logger.info("");
              logger.info("statuscode for" + apiurl + " " + StatusCode);
          }
      }

    }
}
