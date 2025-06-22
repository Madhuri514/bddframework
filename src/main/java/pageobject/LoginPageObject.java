package pageobject;

import org.openqa.selenium.By;

public class LoginPageObject {
    private static By username =
            By.xpath("//*[@id=\"user-name\"]");
    public static By password =
            By.id("password");
    public static By login_btn =
            By.name("login-button");
    public static By errorMsg =
            By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");

    public static By getUserName(){
        return username;
    }

}

