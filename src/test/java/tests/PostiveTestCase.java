package tests;

import org.openqa.selenium.By;

public class PostiveTestCase extends TestCaseBase{
    public void test1(){
        driver.findElement(By.xpath("")).sendKeys("");
    }
}
