package driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

static WebDriver driver;

public static void openBrowser(){
    driver = new ChromeDriver() ;
    driver.manage().window().maximize();
}

public static void openUrl(String url){
driver.get(url);
}

public static WebDriver getDriver(){
return driver;
}

}
