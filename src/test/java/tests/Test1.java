package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    static Dimension mobileDimension = new Dimension(300,900);
    static Dimension tabDimension = new Dimension(700,900);

    public static void main(String[] args) {
        validate_Invalid_user();
    }
    public static void validate_Invalid_user(){
        // ChromeDriver class object
        // Selenium is a tool which can interact with browser
        ChromeDriver driver = new ChromeDriver();
        // open a separate session = no-cache
        driver.get("https://www.saucedemo.com/"); // WebSite open
        //driver.manage().window().maximize();  // maximize

        // locators
        // id
        // name
        // class - dont depends much
        // tag
        // linktext
        // partial link text
        // xpath
        // css selector

        By usernameRef = By.xpath("//*[@id=\"user-name\"]");
        WebElement usernameElem = driver.findElement(usernameRef);
        usernameElem.sendKeys("abcd");

        By passwordRef = By.id("password");
        WebElement passElem = driver.findElement(passwordRef);
        passElem.sendKeys("sdfad");

        driver.findElement(By.name("login-button")).click();

        WebElement errorMsg = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));
        String msg = errorMsg.getText();
        System.out.println(msg);

        // BDD

        // a = b
        // b = c
        // c = a

        // One workaround to test website responsive-ness
        //driver.manage().window().setSize(tabDimension);

        // driver.close(); // kills current tab
//        driver.quit();  // kills entire session

//        4000 min // 600 hours , 25 day
        // 50 machine -

    }

    public static void validate_Empty_username_valid_password(){

    }

}
