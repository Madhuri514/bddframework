package tests;

import driverfactory.DriverFactory;
import modules.LoginModule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import utilities.PropertiesUtils;

import java.io.IOException;
import java.util.Properties;

public class TestCaseBase {

    WebDriver driver;
    Properties envProp;
    LoginModule loginModule;
    @BeforeTest
    public void loadEnvironment() throws IOException {
        Properties global = PropertiesUtils.readConfigProperties("global");
        envProp = PropertiesUtils.readConfigProperties(global.getProperty("env"));
    }


    @BeforeMethod
    public void beforeTestCase(){
        DriverFactory.openBrowser();

        driver.get(envProp.getProperty("url"));

        loginModule = new LoginModule(driver);
    }

    // getting env data from property file
    // dev, qa, uat, pre-prod, prod

    @AfterMethod
    public void afterTestCase(){
        driver.close();
    }

}
