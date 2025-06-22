package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.LoginPageObject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LoginModule {
    WebDriver driver;
    public LoginModule(WebDriver driver){
        this.driver  = driver;
    }

    public void login(String username, String password){
        enterUserName(username);
        enterPassword(password);
        clickLogin();

    //

        Select s1 = new Select(driver.findElement(By.xpath("")));
        List<WebElement> jk = s1.getAllSelectedOptions();
        for(WebElement k : jk){
            System.out.println(k.getText());
        }


    }

    public void enterUserName(String username){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(LoginPageObject.getUserName()));
        driver.findElement(LoginPageObject.getUserName()).sendKeys(username);

        driver.navigate().to("https://www.facebook.com");
        //driver.navigate().

        // Handles
        Set<String> allHandles = driver.getWindowHandles();
        String currentWindowHandle =  driver.getWindowHandle();
        int index = 0 ;
        for(String handle : allHandles) {
            if(index == 3) {
                driver.switchTo().window(handle);
                if(driver.getTitle().equals("")){

                }
                break;
            }
            index++;
        }
    }

    public void enterPassword(String password){
        driver.findElement(LoginPageObject.password).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(LoginPageObject.login_btn).click();
    }

    public String getErrorMessage(){
        WebElement errorMsg = driver.findElement(LoginPageObject.errorMsg);
        String msg = errorMsg.getText();
        return msg;
    }


    public void validateSorting(){
     List<WebElement> allElements = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
     List<Double> priceList = new ArrayList<>();
     for(WebElement elm : allElements){
     String price = elm.getText();
     price = price.replace("$","").trim();
        priceList.add(Double.parseDouble(price));
     }

     for(int i = 1; i < priceList.size() ; i++){
        if(priceList.get(i-1) <= priceList.get(i) ){
        // sorted
        }else{
        // Assertion for sorted algorithm failed
        }
     }


    }


}
