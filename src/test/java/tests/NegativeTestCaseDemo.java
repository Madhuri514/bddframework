package tests;

import modules.LoginModule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pageobject.LoginPageObject;
import utilities.PropertiesUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class NegativeTestCaseDemo extends  TestCaseBase{

    // from lower to higher
    // by default priority is 0
    // priority can be negative
    // invocationCount = how many-time testcase will execute
    // enabled = true/ false

    // @beforeMethod = will execute before every test method of that class


    // Login Page - 100 users
    // TDD Approach - flow - journey same but test data is different

    //  waterfall - separate team  and
    //  agile - dev + testing  (dev)
    //  devops - dev + ops


    // BDD
    @DataProvider(name = "loginData")
    public static Object[][] testData(){
        Object[][] testdata = {
                {"invalid", "invalid", "Epic sadface: Username and password do not match any user in this service"},
                {"", "", "Epic sadface: Username is required"},
                {"standard_user", "", "Epic sadface: Password is required"},
                {"invalid", "", "Epic sadface: Password is required"},
                {"", "secret_sauce", "Epic sadface: Username is required"},
                {"standard_user", "wrongpassword", "Epic sadface: Username and password do not match any user in this service"},
                {"", "", "Epic sadface: Username is required"},
                {"user@123", "secret_sauce", "Epic sadface: Username and password do not match any user in this service"},
                {"standard_user", "pass@123", "Epic sadface: Username and password do not match any user in this service"},
                {"user!@#", "pass!@#", "Epic sadface: Username and password do not match any user in this service"},
                {"short", "secret_sauce", "Epic sadface: Username is required"},
                {"standard_user", "short", "Epic sadface: Password is required"},
                {"<script>alert('x')</script>", "secret_sauce", "Epic sadface: Username and password do not match any user in this service"},
                {"standard_user", "<script>alert('x')</script>", "Epic sadface: Username and password do not match any user in this service"},
                {"standard_user", "p@$$w0rd", "Epic sadface: Username and password do not match any user in this service"},
                {"userWithSpaces   ", "secret_sauce", "Epic sadface: Username and password do not match any user in this service"},
                {"standard_user", "   ", "Epic sadface: Password is required"}
        };
        return testdata;
    }

    @Test(priority = 1, dataProvider = "loginData")
    public void validateInvalidLoginFunctionality(String username, String password, String expectedErrorMsg){
        loginModule.login(username, password);
        Assert.assertEquals(loginModule.getErrorMessage(), expectedErrorMsg);
    }

}
