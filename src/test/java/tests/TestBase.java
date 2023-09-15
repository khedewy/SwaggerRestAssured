package tests;

import APIs.Users;
import data.ReadData;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;

import java.io.FileNotFoundException;

public class TestBase {
    Users users;
    ReadData createUserData;
    ReadData putUserData;

    @BeforeMethod
    public void setData() throws FileNotFoundException {
        users = new Users();
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        createUserData = new ReadData("src/test/java/data/createUserData.json");
        putUserData = new ReadData("src/test/java/data/putData.json");

    }
}
