package inheritance;

public class BrowserDemo {
    public static void main(String[] args) {
        Browser br = new ChromeBrowser();
        br.sendKeys("Google1");
        br.sendKeys("Google2");
        br.sendKeys("Google3");
        br.sendKeys("Google4");
        br.sendKeys("Google5");
        br.sendKeys("Google6");
      //  br.click();
    }
}

// Overriding parent method in child class is optional?
// how to make it mandatory
//  abstract class allow abstract and concrete both methods
// interface only allow abstract method
// abstract class cant be instantiate

interface Browser{
    public void sendKeys(String value);
}
class ChromeBrowser implements Browser{
    public void sendKeys(String value){
        System.out.println("Chrome " + value);
    }
}
class FireFoxBrowser implements Browser{
    public void sendKeys(String value){
        System.out.println("Firefox " + value);
    }
}
